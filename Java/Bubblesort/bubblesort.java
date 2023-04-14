import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class bubblesort{
	//main mehtod
	public static void main(String[] args ){
		int[] arr =  CSV_toArr(args[0],args[1]);
		//showarr(arr);
		
		Runtime rt = Runtime.getRuntime();
		long totalMemBefore = rt.totalMemory();
		long freeMemBefore  = rt.freeMemory();
		long usedMemBefore  = totalMemBefore - freeMemBefore;
		
		bubblesort(arr);

		long totalMemAfter = rt.totalMemory();
		long freeMemAfter  = rt.freeMemory();
		long usedMemAfter  = (totalMemBefore - freeMemBefore) - usedMemBefore;
		File f = new File("./results/BubbleSortMemory-PC#.csv"); //replace # with PC number
		try{
			FIleWriter fw = new FileWriter(f, true);
			fw.write(usedMemAfter+",");
			fw.close();
		} catch (Exception e){
			System.out.println(e);
		}
		//showarr(arr);
	}

	//method to read CSV files and convert them to Array
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

	//INT sorting algorithm
	public static int[] bubblesort(int[] arr){
		for(int i = 0; i < arr.length -1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	public static void showarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
}
