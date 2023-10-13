import java.util.Date;
import java.util.Random;

public class PolymorphismReal {

	public static void main(String[] args) {

		Account account = new Account((new Random().nextInt(7)), (new Random().nextDouble(2000)));
		
		System.out.println(account.toString());
		
		SavingsAccount savings = new SavingsAccount((new Random().nextInt(7)), (new Random().nextDouble(2000)));
		
		System.out.println(savings.toString());
		
		CheckingAccount checking = new CheckingAccount((new Random().nextInt(7)), 
				(new Random().nextDouble(2000)), (new Random().nextDouble(200)));
		
		System.out.println(checking.toString());
		

	}

}

class CheckingAccount extends Account {
	
	private double overdraftLimit;
	
	CheckingAccount(int id, double initialBalance, double overdraftLimit) {
		
		super(id, initialBalance);
		this.overdraftLimit = overdraftLimit;
	}
	
	CheckingAccount() {
		
		this(0,0,0);
	}
	
	double getOverdraftLimit() {
		
		return this.overdraftLimit;
	}
	
	double minimumBalance() {
		//this wasn't in the UML but it was convenient
		return (0 - overdraftLimit);
	}
	
	void setOverdraftLimit(double overdraftLimit) {
		
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		
		if ((this.getBalance() - amount) < minimumBalance()) {
			
			this.setBalance(minimumBalance());
		} else {
			
			super.withdraw(amount);
		}
	}
	
	public String toString() {
		
		return ("Checking Account number " + this.getId() + " has a balance of $" 
		+ this.getBalance() + ", and an overdraft limit of $" + overdraftLimit + ". ");
	}
	
}

class SavingsAccount extends Account {
	
	SavingsAccount(int id, double initialBalance) {
		
		super(id, initialBalance);
	}
	
	SavingsAccount() {
		
		this(0,0);
	}
	
	public void withdraw(double amount) {
		
		if ((this.getBalance() - amount) < 0) {
			
			this.setBalance(0);
		} else {
			
			super.withdraw(amount);
		}
	}
	
	public String toString() {
		
		return ("Savings Account number " + this.getId() + " has a balance of $" + this.getBalance() + ". ");
	}
}
