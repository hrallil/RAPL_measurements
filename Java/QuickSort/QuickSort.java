import java.io.*;
import java.util.Scanner;

public class QuickSort{
	public static void main(String[] args){
		int[] arr = {3,1,9,8,7,6,5,4,3,2,1,-10,0,-Integer.MAX_VALUE, Integer.MAX_VALUE+1, Integer.MAX_VALUE-1, Integer.MAX_VALUE};//CSV_toArr(args[0], args[1]);//;
		/*
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		 */
		quicksort(arr,1,arr.length-1);
		/**/
		System.out.println("Sorting");
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Correctly sorted: " + testQuicksort(arr)); 
		 
	}

	public static int[] CSV_toArr(String path, String fileSize){
		int[] arr = new int[Integer.parseInt(fileSize)];
		try{
			Scanner sc = new Scanner(new File(path));
			sc.useDelimiter(",");
			int i = 0;
			while(sc.hasNext()){
				arr[i] = Integer.parseInt(sc.next());
				i++;
			}
			sc.close();
			return arr;
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Failed to read csv: " + path +"\n");
		}
		return arr;
	}

	public static void quicksort(int[] arr, int low, int high){
		if(low < high){
			int pivotLocation = partition(arr,low-1,high);
			quicksort(arr,low,pivotLocation-1);
			quicksort(arr,pivotLocation+1,high);
		}
	}

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[high]; //middleOfThree(arr[0], arr[(int)arr.length/2], arr[arr.length-1]);
		int leftwall = low - 1;
		int temp;
		for(int i = low; i < high;i++){
			if(arr[i] <= pivot){
				leftwall ++;
				swap(arr, leftwall, i);
				/*
				temp = arr[i];
				arr[i] = arr[leftwall];
				arr[leftwall] = temp;
				*/
				//swap(arr,i,leftwall);
			}
		}
		swap(arr, high, leftwall + 1);
		/* 
		temp = arr[high];
		arr[high] = arr[leftwall + 1];
		arr[leftwall + 1] = temp;
		*/
		//swap(arr,pivot,leftwall);
		return leftwall + 1;
	}
	
	//median of three
	public static int middleOfThree(int a, int b, int c){
        // Checking for b
        if ((a < b && b < c) || (c < b && b < a))
            return b;
        // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
        	return a;
        else
        	return c;
    }

	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static boolean testQuicksort(int[] arr){
		boolean correctness = true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]){
				correctness = false;
			}
		}
		return correctness;
	}
}
