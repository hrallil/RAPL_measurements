import java.util.Random;
public class bubblesort{
	//main mehtod
	public static void main(String[] args ){
		double[] arr =  makeArrDouble(1024);
		System.out.print("Unsorted List: ");
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		bubblesort(arr);
		
		System.out.print("sorted List: ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	//INT sorting algorithm - overloaded
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
	//LONG sorting algorithm, does nothing for now - overloaded
	public static long[] bubblesort(long[] arr){
		for(int i = 0; i < arr.length -1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){

					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	//FLOAT sorting algorithm, does nothing for now - overloaded
	public static float[] bubblesort(float[] arr){
		for(int i = 0; i < arr.length -1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){

					float temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	//DOUBLE sorting algorithm, does nothing for now - overloaded
	public static double[] bubblesort(double[] arr){
		for(int i = 0; i < arr.length -1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){

					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	//creates dataset_INT to sort
	public static int[] makeArrInt(int size){
		Random r = new Random();
		int[] arr = new int[size];
		for(int i=0; i < size; i++){
			arr[i] = r.nextInt(Integer.MAX_VALUE);
		}
		return arr;
	}
	
	//creates dataset_LONG to sort
	public static long[] makeArrLong(int size){
		Random r = new Random();
		long[] arr = new long[size];
		for(int i=0; i < size; i++){
			arr[i] = r.nextLong();
		}
		return arr;
	}
	//creates dataset_FLOAT to sort
	public static float[] makeArrFloat(int size){
		Random r = new Random();
		float[] arr = new float[size];
		for(int i=0; i < size; i++){
			arr[i] = r.nextFloat();
		}
		return arr;
	}
	//creates dataset_DOUBLE to sort
	public static double[] makeArrDouble(int size){
		Random r = new Random();
		double[] arr = new double[size];
		for(int i=0; i < size; i++){
			arr[i] = r.nextDouble();
		}
		return arr;
	}



}
