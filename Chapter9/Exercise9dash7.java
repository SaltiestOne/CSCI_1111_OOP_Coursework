import java.util.Date;

public class Exercise9dash7 {

	public static void main(String[] args) {
		
		Account mine = new Account(1122,20000);
		
		Account.setAnnualInterestRate(4.5);
		
		System.out.print("New Account info:\n");
		
		accountInfo(mine);
		
		mine.withdraw(2500);
		
		System.out.print("\nWithdrawing $2500.");
		
		mine.deposit(3000);
		
		System.out.print("\n\nDepositing $3000.");
		
		System.out.print("\n\nUpdated Account info:\n");
		
		accountInfo(mine);
	}

	public static void accountInfo(Account a) {
		
		System.out.printf("ID: %d\nBalance: %.2f\nMonthly Interest: %.1f\nDate Created: ",
				a.getId(),a.getBalance(),a.getMonthInterest());
		System.out.println(a.getDateCreated());
	}
	
}



class Account {
	
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private Date dateCreated;
	
	
	Account() {
		
		dateCreated = new Date();
		
	}
	
	Account(int idNum, double initialBalance) {
		
		id = idNum;
		balance = initialBalance;
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

	
}