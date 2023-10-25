
import java.util.Scanner;

public class ExtendingClassesReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Triangle triangle = new Triangle(
				promptedInput("Today we're going to make a triangle.\n\nEnter the length of the first side: "),
				promptedInput("\nThe second side: "),promptedInput("\nAnd the third side: "));
		//seemed more efficient than using variables
		System.out.print("\nWhat color is it? ");
		
		triangle.setColor(input.next());
		
		System.out.print("\nIs the inside filled? (True/false) ");
		
		triangle.setFilled(input.nextBoolean());
		
		String message = ("\nThe area of the triangle is %.2f,\nthe perimeter is %.2f,\n"
				+ "the color is %s,\nand it is ");
		
		if (triangle.isFilled()) {
			
			message += "filled in.";
		} else {
			
			message += "not filled in.";
		}

		
		System.out.printf(message,triangle.getArea(),triangle.getPerimeter(),triangle.getColor());

		
	}
	
	public static double promptedInput(String message) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(message);
		
		return input.nextDouble();
		
	}

}
