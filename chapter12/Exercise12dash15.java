
import java.util.Random;
import java.util.random.*;

public class Exercise12dash15 {

	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
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

}
