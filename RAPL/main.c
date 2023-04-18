#include <stdio.h>
#include <time.h>
#include <math.h>
#include <string.h>
#include <sys/time.h> /* for gettimeofday() */
#include <stdlib.h>   /* for system() */
#include "rapl.h"

#define RUNTIME 1


int main (int argc, char **argv)
{ char command[500]="",language[500]="", test[500]="", path[500]="";
  int  ntimes = 1; //nr of runs per algo array
  int  core = 0;
  int  i=0;

#ifdef RUNTIME
  //clock_t begin, end;
  double time_spent;
  struct timeval tvb,tva;
  int temp;
#endif

  FILE * fp;
  FILE * fptemp;

  //Run command
  //strcpy(command, "./" );
  strcat(command,argv[1]);
  //Language name
  strcpy(path,"../");


  strcpy(language,argv[2]);
  strcat(language,".csv");
  strcat(path,language);
  //Test name
  strcpy(test,argv[3]);

  //ntimes = atoi (argv[2]);

  //define pointers
  //append to results csv
  fp = fopen(path,"a");
  // if (fp == NULL)
  //   {
  //       printf("%s failed to open.", path);
  //       //fprintf(stderr, "can't open %s: %s\n", path, strerror(errno));
  //       exit(0);
  //   }
  //printf("happy1");
  //fflush(stdout);
  //read temp file
  //fptemp = fopen("/sys/class/thermal/thermal_zone0/temp", "r");
  fptemp = fopen("/sys/class/thermal/thermal_zone0/tem", "r");
  if (fptemp == NULL)
    {
        printf("%s failed to open.", fptemp);
        //fprintf(stderr, "can't open %s: %s\n", path, strerror(errno));
        exit(0);
    }
    
  printf("happy1");
  fflush(stdout);
  
  rapl_init(core);

  //fprintf(fp,"Package , CPU , GPU , DRAM? , Time (sec) \n");

  for (i = 0 ; i < ntimes ; i++)
    {
 	printf("%d", i);
    	fprintf(fp,"%s,",test);

		#ifdef RUNTIME
		    //begin = clock();
				gettimeofday(&tvb,0);
		#endif

  //calls function in rapl.c
	rapl_before(fp,core);

		system(command);
  
	rapl_after(fp,core);

		#ifdef RUNTIME
			//end = clock();
			//time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
			gettimeofday(&tva,0);
			time_spent = (tva.tv_sec-tvb.tv_sec)*1000000 + tva.tv_usec-tvb.tv_usec;
			time_spent = time_spent / 1000;

  //printf("happy1");
  //fflush(stdout);
			fscanf(fptemp, "%d", &temp);
  //printf("happy2");
  //fflush(stdout);
		#endif

		#ifdef RUNTIME
      temp = temp / 1000;
			fprintf(fp, "%d, ", temp); 
 // printf("happy3");
 //fflush(stdout);

			fprintf(fp, "%G \n", time_spent);
		#endif	
    }

  //closes stream and underlying file
  fclose(fp);
  fclose(fptemp);
  //any unwritten data in stream output buffer is written to the terminal
  fflush(stdout);

  return 0;
}



