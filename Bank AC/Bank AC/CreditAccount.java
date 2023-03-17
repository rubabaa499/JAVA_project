import java.util.Scanner;

class CreditAccount extends Account
{
	private double minbalance;
	private double singlelimit;
	private double amount;
	
	protected CreditAccount()
	{
		this.minbalance=-100000d;
		this.singlelimit=20000d;
	}
	
	
	public String Deposit ()
	{
		System.out.println("Enter Deposit Amount: ");
		amount=obj.nextDouble();
		
		if(amount>super.balance || amount<=this.singlelimit)
		{
			super.balance=super.balance+amount;
			System.out.println("\nAccount Deposited Succesfully By:"+amount);
			System.out.println("Current Balance: " +(super.balance+this.minbalance));
			
			return "Current Balance: " +(super.balance+this.minbalance);
		}
		else 
		{
			System.out.println("\nAccount Deposited Unsuccesfully!");
			System.out.println("Please check your Limitation!");
			System.out.println("Your Single Transaction Limit Is:"+this.singlelimit);
			System.out.println("Current Balance: " +(super.balance+this.minbalance));
			
			return "Current Balance: " +(super.balance+this.minbalance);
		}
	}
	
	public String Withdraw ()
	{
		System.out.println("Enter Withdraw Amount: ");
		amount=obj.nextDouble();
		
		if(amount>=(super.balance+this.minbalance)*0.5 && amount<=this.singlelimit)
		{
				super.balance = (super.balance+this.minbalance) - amount;
				System.out.println("\nAccount Withdrew Succesfully By:" +amount);
				System.out.println("Current Balance: " +super.balance);
			
				return "Current Balance: " +super.balance;
		}
		else 
		{ 
			System.out.println("\nAccount Withdrew Unsuccesfully!");
			System.out.println("Due to Insufficient Balance!");
			System.out.println("Current Balance: " +super.balance);
			
			return "Current Balance: " +super.balance;
		}
			
			
	}
	
	public String toString()
	{
		return "Name:" +this.name + "\nID: " +id + "\nDate of Birth: " +this.dob+ "\nNominee:" +this.nominee + "\nBalance:" +this.balance;
	}	
	
}