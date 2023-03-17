package mypackageB;
import java.util.Scanner;


public class DebitAccount
{
	public double MaximumBalance;
	public double MinimumDiposit;
	public double MinimumWithdraw;
	public double Amount;
	public double Balance;
	public String AcNo;
	
	
	Scanner a=new Scanner(System.in);
	
	public DebitAccount()
	{
		this.MaximumBalance=MaximumBalance=10000000;
		this.MinimumDiposit=MinimumDiposit=2000;
		this.MinimumWithdraw=MinimumWithdraw=500;
		this.Amount=Amount;
		this.Balance=Balance;
		this.AcNo=AcNo;
	}

	public String  Deposit ()
	
	{
		
		
		System.out.println("Please Enter Your Account Number: ");
		AcNo=a.nextLine();
		
		System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
		
		System.out.println("Enter The Deposit Amount: ");
		Amount=a.nextDouble();
		
		if(Amount+Balance<=MaximumBalance && Amount>=MinimumDiposit)
		{
			Balance=Balance+Amount;
			System.out.println("\nAmount Deposited Succesfully By:"+Amount);
			System.out.println("\nCurrent Balance Of Your Debit Account Is: " + Balance);
			return ("\nCurrent Balance Of your Debit Account Is: " + Balance);
		}
		else 
		{
			System.out.println("\nDeposite Unsuccessful");
			System.out.println("\nMinimum Diposited Amount is 2000 Taka");
			System.out.println("\nCurrent Balance Of Your Debit Account Is: " + Balance);
			return ("\nCurrent Balance Of Your Debit Account Is: " + Balance);
		}
		   
	}
	
	
	
	public String Withdraw ()
	
	{	System.out.println("Please Enter Your Account Number: ");
		AcNo=a.nextLine();
		
		System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
		
		System.out.println("Enter The Withdraw Amount: ");
		Amount=a.nextDouble();
		
		if( Amount<=Balance && Amount>=MinimumWithdraw)
		{
			Balance = Balance - Amount;
			System.out.println("\nAmount Withdrew Succesfully By:" +Amount);
			System.out.println("\nCurrent Balance Of Your Debit Account Is: " +Balance);
			return ("\nCurrent Balance Of Your debit Account Is: " +Balance);
		}
		else 
		{ 
			System.out.println("\nWithdrw Unsuccessful");
			System.out.println("\nMinimum Withdraw Amount Is 500 Taka");
			System.out.println("\nCurrent Balance Of Your Debit Account Is: " +Balance);
			return ("\nCurrent Balance Of Your Debit Account Is: " + Balance);
		}
	}
	
	
	public String ShowDebit()
	{
		return "\nAccount Number: " +AcNo +  "\nBalance:" +Balance;
	}		
}