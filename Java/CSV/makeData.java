import java.util.*;
import java.io.*;

public class makeData{
	public static void main(String[] args){
		writeFile(args[0],args[1]);
	}


	// Write to file method. Will write acording to input from main. can write :sorted data, reverse sorted data, partially sorted data 
	// and will default to random data
	public static void writeFile(String s, String type){
		int arraySize = Integer.parseInt(s);
		File f = new File("./data/" + type + "-" + arraySize + ".csv");
		Random r = new Random();
		try{
			PrintWriter w = new PrintWriter(f);
			
			if(type.equals("sorted")){
				for (int i = 0; i < arraySize; i++) {
					w.println(i);
				}
			}
			if (type.equals("reverseSorted")) {
				for (int i = 0; i < arraySize; i++) {
					w.println(arraySize - i);
				}
			}
			if (type.equals("partialSorted")) { //what does partially sorted mean ? 
				for (int i = 0; i < arraySize; i++) {
					w.println(arraySize - i);
				}
			}
			if(type.equals("random") || type==null){
				for(int i = 0; i<arraySize;i++){
					w.println(r.nextInt());
				}
				w.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
