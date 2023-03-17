package mypackageD;
import java.util.Scanner;


interface Transection
{
	
public void Transfer ();

}

interface Show 
{
	
public String ShowTrans ();

}



public class Transfer implements Transection,Show
{ 		
	
	public String TransAcNo;
	public String TransToAcNo;
	public double Amount;
	public double Balance;
	public double MinimumTransfer;
	public double MustAmmount;
	
	
	public Transfer()
	{
		this.TransAcNo=TransAcNo;
		this.Amount=Amount;
		this.Balance=Balance;
		this.TransToAcNo=TransToAcNo;
		this.MinimumTransfer=MinimumTransfer=1000;
		this.MustAmmount=MustAmmount=10000;
		
	}
	
	
	
	Scanner a =new Scanner(System.in);
	
	public void Transfer ()
	{

		System.out.println("Please Enter Your Account Number: ");
		TransAcNo=a.nextLine();
		
		System.out.println("Enter The Balance: ");
		Balance=a.nextDouble();
		
		System.out.println("Enter The Account Number You Want To Transfer Money: ");
		TransToAcNo=a.next();
		
		System.out.println("Enter The Transfer Amount: ");
		Amount=a.nextDouble();
		
		
		
		if(Balance>=MustAmmount && Amount>=MinimumTransfer)
		{
			Balance=Balance-Amount;
			System.out.println("\nAmount Transfer Succesfully By:"+Amount);
			System.out.println("\nAmount Transfer Succesfully To The Account Number:"+TransToAcNo);
			System.out.println("\nCurrent Balance Of Your Transfer Account Is: "+Balance);
			
		}
		else 
		{
			System.out.println("\nAmount Transfer Unsuccesfully!");
			System.out.println("\nMinimum Balance Of your Account Should be 10000 Taka");
			System.out.println("\nMinimum Balance To Transfer Should be 1000 Taka");
			
		}
		
		
	
	}
	
	
	
	public String ShowTrans()
	{
		return "\nAccount Number: " +TransAcNo +  "\nBalance:" +Balance  +"\nTransfer To Account Number:" +TransToAcNo;
	}
	   

}
	

	
	
