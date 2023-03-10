import java.io.*;
import java.util.Scanner;

public class QuickSort{
	public static void main(String[] args){
		int[] arr = CSV_toArr(args[0], args[1]);
		/*for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}*/

		quicksort(arr,0,arr.length-1);

		//System.out.println("Sorting " + args[0]);
		/*for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}*/
	}

	public static int[] CSV_toArr(String path, String fileSize){
		int[] arr = new int[Integer.parseInt(fileSize)];
		try{
			Scanner sc = new Scanner(new File(path));
			sc.useDelimiter(", |\n");
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
			int pivotLocation = partition(arr,low,high);
			quicksort(arr,low,pivotLocation);
			quicksort(arr,pivotLocation+1,high);
		}
	}

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int leftwall = low;
		int temp;
		for(int i = low+1; i <= high;i++){
			if(arr[i] < pivot){
				temp = arr[i];
				arr[i] = arr[leftwall];
				arr[leftwall] = temp;
				//swap(arr,i,leftwall);
				leftwall ++;
			}
		}
		temp = pivot;
		pivot = arr[leftwall];
		arr[leftwall] = temp;
		//swap(arr,pivot,leftwall);
		return leftwall;
	}

	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
