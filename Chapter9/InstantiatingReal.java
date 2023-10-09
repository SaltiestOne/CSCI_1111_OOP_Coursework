
public class InstantiatingReal {

	public static void main(String[] args) {

		Rectangle recA = new Rectangle(40, 4);
		Rectangle recB = new Rectangle(35.9, 3.5);
		
		System.out.print("\t\tRectangle A\tRectangle B\n");
		System.out.printf("Width    |\t%5.1f\t\t%5.1f\n",recA.width,recB.width);
		System.out.printf("Height   |\t%5.1f\t\t%5.1f\n",recA.height,recB.height);
		System.out.printf("Area     |\t%5.1f\t\t%5.1f\n",recA.getArea(),recB.getArea());
		System.out.printf("Perimeter|\t%5.1f\t\t%5.1f\n",recA.getPerimeter(),recB.getPerimeter());
		
	}

}



class Rectangle {
	
	double height = 1;
	double width = 1;
	
	
	Rectangle() {
		
	}
	
	Rectangle(double newHeight, double newWidth) {
		
		height = newHeight;
		width = newWidth;
	}
	
	double getArea() {
		
		return (height * width);
	}
	
	double getPerimeter() {
		
		return (2 * (height + width));
	}
	
}
