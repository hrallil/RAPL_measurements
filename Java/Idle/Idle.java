import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Idle{
	public static void main(String[] args){
		int[] arr = CSV_toArr(args[0],args[1]);	
	}

	public static int[] CSV_toArr(String path, String arrSize){
		int[] arr = new int[Integer.parseInt(arrSize)];
		try{
			Scanner sc = new Scanner(new File(path));
			sc.useDelimiter(",|\n");
			int i = 0;
			while(sc.hasNext()){
				arr[i] = Integer.parseInt(sc.next());
				i++;
			}
		}	
		catch(Exception e){
			System.out.println(e);
			System.out.println("Failed to read CSV" + path +"\n");
		}
		return arr;
	}
}