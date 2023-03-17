package mypackageA;
import java.util.Scanner;

public class CreditAccount 
{

	public double CreditLimit;
	public double Amount;
	public double Balance;
	public String AcNo;
	
	
	
	Scanner a=new Scanner(System.in);
	
	
	public CreditAccount()
	{
		
		this.CreditLimit=CreditLimit=50000;
		this.Amount=Amount;
		this.Balance=Balance;
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
		
		if(Balance<=CreditLimit)
		{
			Balance=Balance-Amount;
			System.out.println("\nAmount Deposited Succesfully By:"+Amount);
			System.out.println("\nCurrent Balance Of Your Credit Account Is:" +(Balance));
			return "\nCurrent Balance Of Your Credit Account Is: " +(Balance);
		}
		else 
		{
			System.out.println("\nDeposite Unsuccessful");
			System.out.println("\nYour Credit Limit is 50000 Taka");
			return "\nCurrent Balance Of Your Credit Account Is: " +(Balance);
		}
	}
	
	public String Withdraw ()
	{   
	    System.out.println("Please Enter Your Account Number: ");
		AcNo=a.nextLine();
		
		
	    System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
	
		System.out.println("Enter Withdraw Amount: ");
		Amount=a.nextDouble();
		
		if(Balance<=CreditLimit)
		{
				Balance = Balance + Amount;
				System.out.println("\nAmount Withdrew Succesfully By:" +Amount);
				System.out.println("\nCurrent Balance Of Your Credit Account Is: " +Balance);
				return "\nCurrent Balance Of Your Credit Account Is: " +Balance;
		}
		else 
		{ 
			System.out.println("\nWithdrw Unsuccessful");
			System.out.println("\nYour Credit Limit is 50000 Taka");
			return "\nCurrent Balance Of Your Credit Account Is: " +Balance;
		}
			
			
	}
	
		
	public String ShowCredit()
	{
		return "\nAccount Number: " +AcNo +  "\nBalance:" +Balance;
	}			
	
}