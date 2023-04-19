#include <stdio.h>
#include <time.h>
#include <math.h>
#include <string.h>
#include <sys/time.h> /* for gettimeofday() */
#include <stdlib.h>   /* for system() */
#include "rapl.h"

#define RUNTIME 1

/*
This code takes in arguements from the algorithm Makefile, for example:
Argv[0] ../../RAPL/main 
Argv[1] "java bubblesort.java "../CSV/data/test0-100.csv" "100" " 
Argv[2] Bubblesort/results/test
Argv[3] bubblesort
*/

int main (int argc, char **argv)
{ char command[500] = "", language[500] = "", test[500] = "", path[500] = "";
  int  n = 10; //nr of iterations in loop
  int  core = 0;
  int  i = 0;

  FILE * fp;
  FILE * fptemp;

#ifdef RUNTIME
  double time_spent;
  struct timeval tvb,tva;
  int temp;
  char temp_path[] = "/sys/class/thermal/thermal_zone0/temp";
#endif

  //Feed arguments into string variables 
  strcat(command,argv[1]);

  //Create path for results csv file
  strcpy(path,"../");
  strcpy(language,argv[2]);
  strcat(language,".csv");
  strcat(path,language);

  //Test name which will be printed in 1. col of csv
  strcpy(test,argv[3]);

  //pointer to csv where data is appended to
  fp = fopen(path,"a");

  // printf("happy1");
  //fflush(stdout);
  
  //calls function in rapl.c (how?)
  rapl_init(core);

  //fprintf(fp,"Package , CPU , GPU , DRAM? , Time (sec) \n");

  //where the test runs happen
  for (i = 0; i < n; i++)
    {
      //print run number to terminal
 	    printf("%d", i);
      //print test name to csv
    	fprintf(fp,"%s,",test);

		#ifdef RUNTIME
      //save start time
      gettimeofday(&tvb,0);
		#endif

      //in rapl.c, reads rapl before and after java code is run
	    rapl_before(fp,core);

		    system(command);
  
	    rapl_after(fp,core);

		#ifdef RUNTIME
			//get end time, calculate wall time
			gettimeofday(&tva,0);
			time_spent = (tva.tv_sec-tvb.tv_sec)*1000000 + tva.tv_usec-tvb.tv_usec;
			time_spent = time_spent / 1000;

      //open, read, close temp file
      fptemp = fopen(temp_path, "r");
      if (fptemp == NULL)
      {
        //printf("%p failed to open.", fptemp);
        //fprintf(stderr, "can't open %s: %s\n", path, strerror(errno));
        exit(1);
      }

  printf("open");
  fflush(stdout);

			fscanf(fptemp, "%d", &temp);
  printf("scan");
  fflush(stdout);

	    fclose(fptemp);
  printf("close");
  fflush(stdout);
		#endif

		#ifdef RUNTIME  
      //add temp, time to csv
      temp = temp / 1000;
			fprintf(fp, " %d, ", temp); 
 // printf("happy3");
 //fflush(stdout);

			fprintf(fp, " %G\n", time_spent);
		#endif	
    }

  //closes stream and csv file
  fclose(fp);
  
  //any unwritten data in stream output buffer is written to the terminal
  fflush(stdout);

  return 0;
}



