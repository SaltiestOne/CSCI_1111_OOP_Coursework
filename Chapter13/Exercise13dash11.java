import java.util.Random;

public class Exercise13dash11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Octagon octy = new Octagon(new Random().nextDouble(17));
		
		Octagon octissimo = ((Octagon)octy.Clone());

		System.out.print(octy.compareTo(octissimo));
		
	}

}



