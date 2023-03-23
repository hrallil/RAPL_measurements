import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Main {
    	public static void main(String[] args) {
        	int[] arr = CSV_toArr(args[0], args[1]); //{1,0,3,1,3,1};
//        	System.out.println("before: "+ Arrays.toString(arr));
        	int n = arr.length;
        	int max = 0;
        	for (int i = 0; i < n-1; i++){
            		if (arr[i] > max) max = arr[i];
        	}
        	arr = countingSort(arr, max, n);
//		System.out.println("after:  "+ Arrays.toString(arr));
    	}

	public static int[] countingSort(int[] arr, int max, int n){
		//temp array
   		int[] b = new int[n];
        	int[] c = new int[max+1];

        	for (int i = 0; i < n; i++){
            		c[arr[i]] = c[arr[i]] +1;
        	}

        	for (int i = 1; i < max+1; i++){
            		c[i] = c[i] + c[i-1];
        	}

        	for (int j = n-1; j >= 0; j--){
            		b[ c[ arr[j]] -1] = arr[j];
            		c[arr[j]] = c[arr[j]] -1;
		}
		return b;
	}

	public static int[] CSV_toArr(String path, String fileSize){
		int[] arr = new int[Integer.parseInt(fileSize)];
		try{
			Scanner sc = new Scanner(new File(path));
			sc.useDelimiter(", |\n");
			int i = 0;
			while(sc.hasNext()){
				arr[i] = Integer.parseInt(sc.nextLine());
				i++;
			}
			sc.close();
			return arr;
		} catch (Exception e){
			System.out.println(e);
			System.out.println("Failed to read csv: "+path);
		}
		return arr;
	}
}

















