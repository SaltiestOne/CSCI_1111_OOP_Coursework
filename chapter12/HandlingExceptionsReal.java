
import java.util.Scanner;
import java.util.Random;

public class HandlingExceptionsReal {

	public static void main(String[] args) {

		int[] inties = new int[100];
		
		for (int i = 0; i < inties.length; i ++) {
			
			inties[i] = new Random().nextInt(42);
		}
		
		while(true) {
			
			try {
				
				System.out.printf("Enter a number from 1 to %d: ",inties.length);
				
				int choice = boundedInput(1,inties.length);
				
				System.out.printf("Your number is: %d.\n",inties[(choice - 1)]);
			}
			
			catch (IllegalArgumentException ex) {
				
				System.out.println(ex);
			}
						
		}
	}

	
	public static int boundedInput(int min, int max) {
		
		int input = (new Scanner(System.in).nextInt());
		//I'm gonna start making all my one-time inputs like this
		if ((input < min) || (input > max)) {
			
			throw new IllegalArgumentException("Out of bounds.");
		} else {
			
			return input;
		}
		
	}
}

