import java.util.*;
import java.io.*;

public class makeData{
	public static void main(String[] args){
		writeFile(args[0],args[1],args[2]);
	}


	// Write to file method. Will write acording to input from main. can write :sorted data, reverse sorted data, partially sorted data 
	// and will default to random data
	public static void writeFile(String s, String type, String randIteration){
		int arraySize = Integer.parseInt(s);
		File f = new File("./data/" +  type + randIteration + "-" + arraySize + ".csv");
		Random r = new Random();
		try{
			PrintWriter w = new PrintWriter(f);
			
			if(type.equals("sorted")){
				for (int i = 0; i < arraySize - 1; i++) {
					w.print(i +",");
				}
				w.print(arraySize);
			}
			if (type.equals("reverseSorted")) {
				for (int i = 0; i < arraySize - 1; i++) {
					w.print(arraySize - i + ",");
				}
				w.print(0);
			}

			if(type.equals("countingBest")){
				for(int i = 0; i<arraySize- 1;i++){
					w.print(r.nextInt(10) + ",");
				}
				w.print(r.nextInt(10));
			}

			if(type.equals("countingWorst")){
				for(int i = 0; i<arraySize- 1;i++){
					w.print(r.nextInt(100000000) + ",");
				}
				w.print(r.nextInt(100000000));	
			}

			if(type.equals("mergeWorst")){
				int[] arr = new int[arraySize];
				
				for (int i = 0; i < arraySize; i++) {
					arr[i] = i;
				}

				divide(arr);

				for (int i = 0; i < arr.length; i++) {
					w.print(arr[i] + ",");
				}
			}

			if(type.equals("random") || type.equals("test") || type==null){
				for(int i = 0; i<arraySize- 1;i++){
					w.print(r.nextInt(Integer.MAX_VALUE) + ",");
				}
				w.print(r.nextInt(Integer.MAX_VALUE));
			}

			w.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void merge(int[] arr, int[] left, int[] right) {
        int i,j;
        for(i=0;i<left.length;i++)
                arr[i]=left[i];
        for(j=0;j<right.length;j++,i++)
                arr[i]=right[j];
    }

    //Pass a sorted array here to find specific distribution for worst case 
    public static void divide(int[] arr) { 
            if(arr.length<=1)
                return;

            if(arr.length==2)
            {
                int swap=arr[0];
                arr[0]=arr[1];
                arr[1]=swap;
                return;
            }

    //     if ((arr.length % 2) == 0) {
    //         int i,j;
    //         int m = (arr.length + 1) / 2;
    //         int left[] = new int[m];
    //         int right[] = new int[arr.length-m];
    //     } else {
    //     int i,j;
    //     int m = (arr.length) / 2;
    //     int left[] = new int[m];
    //     int right[] = new int[arr.length-m];
    // }    
        int i,j;
        int m = (arr.length + 1) / 2; //this is how alternating elemts are chosen of a sorted array; these are the odd indexes 
        int left[] = new int[m];
        int right[] = new int[arr.length-m]; //whatever is leftover goes into the right array

        for(i=0,j=0;i<arr.length;i=i+2,j++) //Storing alternate elements in left subarray
            left[j]=arr[i];

        for(i=1,j=0;i<arr.length;i=i+2,j++) //Storing alternate elements in right subarray
            right[j]=arr[i];

        divide(left);
        divide(right);
        merge(arr, left, right); //worst distribution array put all back together
    }
}
