
import java.util.Random;
import java.util.random.*;

public class ImplementingInterfacesReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject[] obbies = objectMaker(new GeometricObject[5]);
		
		for (int o = 0; o < obbies.length; o++) {
			
			System.out.printf("The area of object %d is %6.3f. ",(o + 1),(obbies[o]).getArea());
			
			if (obbies[o] instanceof Colorable) {
				
				((Colorable)obbies[o]).howToColor();
				//it's so weird typecasting to an interface. feels like it shouldn't work that way
			} else {}
			
			System.out.println();
		}
		
	}
	
	public static GeometricObject[] objectMaker(GeometricObject[] objects) {
		
		for (int o = 0; o < objects.length; o++) {
			
			if (new Random().nextBoolean()) {
				
				objects[o] = new Octagon((new Random().nextDouble(7)));
				//i'm allowed to use octagons right?
			} else {
				
				objects[o] = new Triangle(((new Random().nextDouble(12) + 1)),7,7);
				//it kept giving invalid triangles (with NaN area) if all sides were random
			}
		}
		
		return objects;
	}

}
