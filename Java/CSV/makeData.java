import java.util.*;
import java.io.*;

public class makeData{
	public static void main(String[] args){
		if(args[2] == null){
			args[2] = "";
		}
		writeFile(args[0],args[1], args[2]);
	}


	// Write to file method. Will write acording to input from main. can write :sorted data, reverse sorted data, partially sorted data 
	// and will default to random data
	public static void writeFile(String s, String type, String randIteration){
		int arraySize = Integer.parseInt(s);
		File f = new File("./data/" + type + "-" + arraySize + randIteration + ".csv");
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
				for (int i = 0; i < arraySize; i++) {
					w.print(arraySize - i + ",");
				}
				w.print(0);
			}
			if(type.equals("random") || type==null){
				for(int i = 0; i<arraySize;i++){
					w.print(r.nextInt() + ",");
				}
				w.print(r.nextInt());
			}

			w.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
