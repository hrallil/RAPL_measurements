import java.util.*;
import java.io.*;

public class makeData{
	public static void main(String[] args){
		writeFile(args[0]);
	}
	public static void writeFile(String s){
		File f = new File("./data/" + Integer.parseInt(s) + ".csv");
		Random r = new Random();
		try{
			PrintWriter w = new PrintWriter(f);

			for(int i = 0; i<Integer.parseInt(s);i++){
				w.println(r.nextInt());
			}
			w.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
