import java.util.Date;

public class Account {
	
		private int id;
		private double balance;
		private static double annualInterestRate = 0.0;
		private Date dateCreated;
		
		Account(int id, double initialBalance) {
			
			this.id = id;
			balance = initialBalance;
			dateCreated = new Date();
			
		}
		
		
		Account() {
			
			this(0,0.0);
			dateCreated = new Date();
			
		}
		
		public void deposit(double amount) {
			
			balance += amount;
		}
		
		public void withdraw(double amount) {
			
			balance -= amount;
		}
		
		public int getId() {
			
			return id;
		}
		
		public void setId(int newId) {
			
			id = newId;
		}
		
		public double getBalance() {
			
			return balance;
		}
		
		public void setBalance(double newBalance) {
			
			balance = newBalance;
		}
		
		public Date getDateCreated() {
			
			return dateCreated;
		}
		
		public double getMonthlyInterestRate() {
			
			return (annualInterestRate / 12);
		}
		
		public double getMonthInterest() {
			
			return ((getMonthlyInterestRate() / 100) * balance);
		}
		
		public static double getAnnualInterestRate() {
			
			return annualInterestRate;
		}
		
		public static void setAnnualInterestRate(double newRate) {
			
			annualInterestRate = newRate;
		}
		
		public String toString() {
			
			return ("Account number " + this.getId() + " has a balance of $" + this.getBalance() + ". ");
		}

}
