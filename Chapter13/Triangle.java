
public class Triangle extends GeometricObject implements Colorable {
		//AKA extending classes, and implementing interfaces
		private double side1 = 1.0;
		private double side2 = 1.0;
		private double side3 = 1.0;
		
		Triangle(double side1, double side2, double side3) {
			
			super();
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		Triangle() {
			
			this(1.0,1.0,1.0);
		}
		
		double getSide1() {
			
			return side1;
		}
		
		void setSide1(double side1) {
			
			this.side1 = side1;
		}
		
		double getSide2() {
			
			return side2;
		}
		
		void setSide2(double side2) {
			
			this.side2 = side2;
		}

		double getSide3() {
		
			return side3;
		}
		
		void setSide3(double side3) {
			
			this.side3 = side3;
		}
		
		double getArea() {
			
			double s = ((side1 + side2 + side3) / 2);
			
			return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));		
		}
		
		double getPerimeter() {
			
			return (side1 + side2 + side3);
		}
		
		public String toString() {
			
			return ("Triangle: side 1 = " + side1 + " side2 = " 
			+ side2 + " side3 = " + side3);
		}
		
		public void howToColor() {

			System.out.print("Color all three sides. ");
			
		}
		
		
	}