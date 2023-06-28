import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class CountingSort {
	public static void main(String[] args) {
		int[] arr = CSV_toArr(args[0], args[1]); //{1,0,3,1,3,1};
//        	System.out.println("before: "+ Arrays.toString(arr));
		int n = arr.length;
		int max = 0;
		for (int i = 0; i < n-1; i++){
				if (arr[i] > max) max = arr[i];
		}
	
		for (int i = 0; i < 400; i++){
			int[] arrCopy = new int[arr.length];
			System.arraycopy(arr, 0, arrCopy, 0, arr.length);
			
			arr = countingSort(arr, max, n);
		}
//		
	// Runtime rt = Runtime.getRuntime();
	// long totalMemAfter = rt.totalMemory();
	// long freeMemAfter  = rt.freeMemory();
	// long usedMemAfter  = (totalMemAfter - freeMemAfter);// - usedMemBefore;
	// File f = new File("./results/CountingSortMemory-PC#.csv"); //replace # with PC number
	// try{
	// 	FileWriter fw = new FileWriter(f, true);
	// 	fw.write(usedMemAfter+",");
	// 	fw.close();
	// } catch (Exception e){
	// 	System.out.println(e);
	// }
	
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
			System.out.println("Failed to read csv: "+path);
			System.exit(0);
		}
		return arr;
	}
}

















