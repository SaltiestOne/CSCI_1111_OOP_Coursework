import java.util.Date;
import java.util.Scanner;

public class Exercise10dash7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account[] directory = new Account[10];
		int choice = 0;
		
		for (int a = 0; a < 10; a++) {
			
			directory[a] = new Account(a,100);
		}
		
		while(true) {
			
			do {
			//error message protocol.	
				System.out.print("Enter an ID number: ");
				
				choice = input.nextInt();
				
				if ((choice < 0) || (choice > 9)) {
					
					System.out.print("Invalid ID. Please try again.\n");
				}
			} while ((choice < 0) || (choice > 9));
			
			int id = choice;
			
			choice = 0;
			
			while (!(choice == 4)) {
				
				System.out.print("\nMain Menu:\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit\n");
				choice = input.nextInt();
				
				switch (choice) {
				
				case 1: {
					
					System.out.printf("You currently have $%.2f in your account.\n",directory[id].getBalance());
				
					break;
				}
				
				case 2: {
					
					System.out.print("Enter amount to withdraw:\n$");
					directory[id].withdraw(input.nextDouble());
					
					break;
				}
				
				case 3: {
					
					System.out.print("Enter amount to deposit:\n$");
					directory[id].deposit(input.nextDouble());
					
					break;
				}
				
				case 4: {
					
					System.out.print("Thank you for banking with us.\n\n");
					
					break;
					
				}
					
				default: {
					
					System.out.print("Invalid input. Try again.");
					break;
				}
				}
				
			}
			
			
		}
		

		
	}

}


class Account {
	
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

	
}