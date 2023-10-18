
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Exercise12dash15 {

	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
		
		
		writeNumbers(file);
		
		int[] numbies = getNumbers(file);
		
		Integer[] morenumbies = primitiveToObject(numbies);
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList((morenumbies))); 
		
		java.util.Collections.sort(result);
		
		int lines = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.printf("%2d",result.get(i));
			
			lines++;
			
			if (lines >= 5) {
				
				System.out.println();
				lines = 0;
			} else {
				
				System.out.print(" ");
			}
		}
		
		

	}
	
	public static void writeNumbers(java.io.File file) throws Exception {
		
		try (
				
				java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		) {
			
			int lines = 0;
			
			for (int i = 0; i < 100; i++) {
				
				output.printf("%2d",new Random().nextInt(77));
				
				lines++;
				
				if (lines >= 5) {
					
					output.println();
					lines = 0;
				} else {
					
					output.print(" ");
				}
			}
			
		}
	}
	
	public static int[]	getNumbers(java.io.File file) throws Exception {
		
		int[] result = new int[100];
		
		try (
		
		Scanner input = new Scanner(file);
				
		) {
	
			int count = 0;

			while(input.hasNext()) {
				
				result[count] = input.nextInt();
				
				count++;
			}	
		
		}
		
		return result;
		
	}
	
	public static Integer[]	primitiveToObject(int[] input) {
		
		Integer[] result = new Integer[input.length];
		
		for (int i = 0; i < input.length; i++) {
			
			result[i] = new Integer(input[i]);
			//one day, YOU will be deprecated and marked for removal.
		}
		
		return result;
	}
}
