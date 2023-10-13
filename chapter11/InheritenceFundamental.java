
public class InheritenceFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//i'm allowed to copy/paste this part right?
class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;
	  
	  /** Construct a default geometric object */
	  public GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with the specified color 
	    *  and filled value */
	  public GeometricObject(String color, boolean filled) {
		  dateCreated = new java.util.Date();
		  this.color = color;
		  this.filled = filled;
	  }

	  /** Return color */
	  public String getColor() {
		  return color;
	  }
	  
	  /** Set a new color */
	  public void setColor(String color) {
		  this.color = color;
	  }

	  /** Return filled. Since filled is boolean, 
     	its get method is named isFilled */
	  public boolean isFilled() {
		  return filled;
	  }

	  /** Set a new filled */
	  public void setFilled(boolean filled) {
		  this.filled = filled;
	  }
  
	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
		  return dateCreated;
	  }
  
	  /** Return a string representation of this object */
	  public String toString() {
		  return "created on " + dateCreated + "\ncolor: " + color + 
				  " and filled: " + filled;
	  }
}

class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle(double side1, double side2, double side3) {
		
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
	
	double getSide2() {
		
		return side2;
	}

	double getSide3() {
	
		return side3;
	}
	
	double getArea() {
		
		double s = ((side1 + side2 + side3) / 2);
		
		return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
		
	}
	
	double getPerimeter() {
		
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		
		return ("This is a triangle with side lengths of " + side1 + ", " + side2 + ", and " + side3 + ".");
	}
	
	
}