import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

class MergeWorstCase
{
    public static void print(int arr[])
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
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

    
    public static void main(String args[])
    {
        int[] arr = CSV_toArr(args[0], args[1]);
        Arrays.sort(arr);
        /* 
        for (int i= 0; i<arr.length; i++);{
            System.out.println();
        }*/

        divide(arr);
        /*
        System.out.println("The worst case time complexity of this array is: ");
        print(arr); */


                  
    }
    public static int[] CSV_toArr(String path, String arrSize){
        int[] arr = new int[Integer.parseInt(arrSize)];
        try{
            Scanner sc = new Scanner(new File(path)); // possibly failing 
            sc.useDelimiter(",");
            int i = 0;
            while(sc.hasNext()){
                arr[i] = Integer.parseInt(sc.next());
                i++;
            }
            Arrays.sort(arr);

        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Failed to read CSV " + path +"\n");
        } 
        return arr;
    }
}