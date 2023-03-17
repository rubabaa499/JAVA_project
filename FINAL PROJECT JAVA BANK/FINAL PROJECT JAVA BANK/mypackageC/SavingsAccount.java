package mypackageC;
import java.util.Scanner;

public class SavingsAccount 
{   

	public double Balance;
	public double Amount;
	public String AcNo;
	

	Scanner a=new Scanner(System.in);
	
	public SavingsAccount()
	{
		this.Balance=Balance;
		this.Amount=Amount;
		this.AcNo=AcNo;
	}
	
	public String Deposit ()
	{	
	
		System.out.println("Please Enter Your Account Number: ");
		AcNo=a.nextLine();
		
		System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
		
	
		System.out.println("Enter The Deposit Amount: ");
		Amount=a.nextDouble();
		
		Balance=Balance+Amount;
		System.out.println("\nAmount Deposited Succesfully By:"+Amount);
		System.out.println("\nCurrent Balance Of Your Saving Account Is: " +Balance);
		return ("\nCurrent Balance Of Your Saving Account Is: " +Balance);
	}
	
	
	
	public String Withdraw ()
	{	

     	System.out.println("Please Enter Your Account Number: ");
		AcNo=a.nextLine();
		
		System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
		
		System.out.println("Enter The Withdraw Amount: ");
		Amount=a.nextDouble();
		
		if(Amount<=Balance)
		{
			Balance = Balance - Amount;
			System.out.println("\nAmount Withdrew Succesfully By:" +Amount);
			System.out.println("\nCurrent Balance Of Your Saving Account Is: " +Balance);
			return ("\nCurrent Balance Of Your Saving Account Is: " +Balance);
		}
		else 
		{ 
			System.out.println("\nAmount Withdrew Unsuccesfully!");
			System.out.println("\nCurrent Balance Of Your Saving Account Is: " +Balance);
			return ("\nCurrent Balance Of Your Saving Account Is: " +Balance);
		}
			
	}
	
	
	public String ShowSaving()
	{
		return "\nAccount Number: " +AcNo +  "\nBalance:" +Balance;
	}			
}