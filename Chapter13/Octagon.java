class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	private double side;
	
	Octagon(double side) {
		
		super();
		this.side = side;
	}
	
	Octagon() {
		
		this(1.0);
	}
	
	
	
	double getSide() {
		
		return side;
	}
	
	void setSide(double side) {
		
		this.side = side;
	}
	
	double getArea() {
		//this should be the correct formula according to the internet.
		return (2 * (Math.pow(side,2)) * (1 + (Math.sqrt(2))));
	}
	
	double getPerimeter() {
		
		return (side * 8);
	}

	@Override
	public int compareTo(Octagon o) {
	
		if (this.getArea() > o.getArea()) {
			
			return 1;
		} else if (this.getArea() < o.getArea()) {
			
			return -1;
		} else {
		
			return 0;
		}
	}
	
	public Object Clone() throws CloneNotSupportedException {
		
		Octagon Octaclone = (Octagon)super.clone();
		
		Octaclone.setDateCreated(new java.util.Date());
		//a deep clone was not required in the assignment but I did it anyway. hope i got the encapsulation correct
		return Octaclone;
	}
}