
public class DesigningClassesReal {

	public static void main(String[] args) {

	}

}


class MyInteger {
	
	private int value;
	
	MyInteger(int value) {
		
		this.value = value;
	}
	
	int getValue() {
		
		return this.value;
	}
	
	boolean isEven() {
		
		return isEven(this.value);
	}
	
	boolean isOdd() {
		//aren't I clever
		return (!(isEven()));
	}
	
	boolean isPrime() {
		
		return isPrime(this.value);
	}
	
	static boolean isEven(int value) {
		
		if (((value) % 2) == 0) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	static boolean isOdd(int value) {
		
		return (!(isEven(value)));
	}
	
	static boolean isPrime(int value) {
		
		if (value <= 1) {
			//1 is not prime, nor is 0, nor is any negative number
			return false;
		} else if (value == 2) {
			
			return true;
			
		} else {
			
			for (int p = 2; p < value; p++) {
				
				if ((value % p) == 0) {
					
					return false;
				} else {}
			}
			
			return true;
		}
	}
	
	static boolean isEven(MyInteger MyInteger) {
		
		return isEven(MyInteger.getValue());
		
	}
	
	static boolean isOdd(MyInteger MyInteger) {
		
		return (!(isEven(MyInteger)));
	}
	
	static boolean isPrime(MyInteger MyInteger) {
		
		return isPrime(MyInteger.getValue());
	}
	
	boolean equals(int value) {
		
		if (this.value == value) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	boolean equals(MyInteger MyInteger) {
		
		if (this.value == MyInteger.value) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	static int parseInt(char[] numerics) {
		
		int result = 0;
		
		for (int i = 0; i < numerics.length; i++) {
			
			result *= 10;
			
			result += numerics[i];
		}
		
		return result;
		
	}
	
	static int parseInt(String numerics) {
		
		return parseInt(numerics.toCharArray());
	}
	
	
}
