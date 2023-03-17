import java.util.Scanner;

class SavingsAccount extends Account
{
	private double amount;

	public SavingsAccount()
	{
		
	}
	
	
	public String  Deposit ()
	{
		System.out.println("Enter Deposit Amount: ");
		amount=obj.nextDouble();
		
		super.balance=super.balance+amount;
		System.out.println("\nAccount Deposited Succesfully By:"+amount);
		System.out.println("Current Balance: " +super.balance);
		
		return ("Current Balance: " +super.balance);
	}
	
	
	public String Withdraw ()
	{
		System.out.println("Enter Withdraw Amount: ");
		amount=obj.nextDouble();
		
		if(amount<=super.balance)
		{
			super.balance = super.balance - amount;
			System.out.println("\nAccount Withdrew Succesfully By:" +amount);
			System.out.println("Current Balance: " +super.balance);
			
			return ("Current Balance: " +super.balance);
		}
		else 
		{ 
			System.out.println("\nAccount Withdrew Unsuccesfully!");
			System.out.println("Due to Insufficient Balance!");
			System.out.println("Current Balance: " +super.balance);
			return ("Current Balance: " +super.balance);
		}
			
	}
	
	public String toString()
	{
		return "Name:" +this.name + "\nID: " +id + "\nDate of Birth: " +this.dob+ "\nNominee:" +this.nominee + "\nBalance:" +this.balance;
	}	
}