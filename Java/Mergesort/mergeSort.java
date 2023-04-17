import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class MergeSort{
	public static void main(String[] args){
		//long totalMemBefore = rt.totalMemory();
		//long freeMemBefore  = rt.freeMemory();
		//long usedMemBefore  = totalMemBefore - freeMemBefore;
		
		int[] arr = CSV_toArr(args[0], args[1]); //{9, 3, 5, 7, 2, 8, 10, 1, 4, 6};
		//System.out.println("before: "+ Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length -1);
		
		Runtime rt = Runtime.getRuntime();
		long totalMemAfter = rt.totalMemory();
		long freeMemAfter  = rt.freeMemory();
		long usedMemAfter  = (totalMemAfter - freeMemAfter);// - usedMemBefore;
		File f = new File("./results/MergeSortMemory-PC#.csv"); //replace # with PC number
		try{
			FileWriter fw = new FileWriter(f, true);
			fw.write(usedMemAfter+",");
			fw.close();
		} catch (Exception e){
			System.out.println(e);
		}
		
		//System.out.println("after: "+ Arrays.toString(arr));
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
		} catch (Exception e){
			System.out.println(e);
			System.out.println("Failed to read csv: "+ path);
		}
		return arr;
	}

	public static void mergeSort(int[] arr, int left, int right){
		if (left < right){
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right){
		int n1 = mid - left +1; //length of left array
		int n2 = right - mid; //length of right array

		//temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		//copy data to temp arrays
		for (int i = 0; i < n1; i++){
			L[i] = arr[i+left];
		}
		for (int j = 0; j < n2; j++){
			R[j] = arr[j+mid+1];
		}

		//temp index's
		int i = 0;
		int j = 0;
		//array index
		int k = left;
		while (i < n1 && j < n2){
			if (L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		//copy remaining values
		while (i < n1){// || j < n2){
//			if (i < n1){
				arr[k] = L[i];
				i++;
				k++;
//			}
		}
		while (j < n2){
//			if (j < n2){
				arr[k] = R[j];
				j++;
				k++;
//			}
		}
	}
}
