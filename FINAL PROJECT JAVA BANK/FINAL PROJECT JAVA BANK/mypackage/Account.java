package mypackage;
import java.util.Scanner;
 
public class Account 
{   
    public static String AcNo;
	public String Name;
	public String DateBirth;
	public String PhoneNo;
	public String NomineeName;
	public double Balance;
	

	public Scanner a = new Scanner(System.in);
	
	public Account()
	{
		this.AcNo=AcNo;
		this.Name=Name;
		this.DateBirth=DateBirth;
		this.PhoneNo=PhoneNo;
		this.NomineeName=NomineeName;
		this.Balance=Balance;
	
	}
	

	public void CreateAccount()
	{
		System.out.println("Please Enter Your NID Number: ");
		AcNo=a.nextLine();
		
        System.out.println("Please Enter Your Name: ");
		Name=a.nextLine();
        
		System.out.println("Please Enter The Date Of Birth(DD-MM-YYYY): ");
		DateBirth = a.nextLine();
		
		System.out.println("Please Enter The Phone Number: ");
		PhoneNo = a.nextLine();
	    
		System.out.println("Please Enter The Nominee Name Of Your Account: ");
		NomineeName=a.nextLine();
   
		System.out.println("Please Enter Balance Of Your Account: ");
		Balance=a.nextDouble();
		
	}
	

	public String ShowAccount()
	{
		return  "\nAccount Number: " +AcNo + "\nName:" +Name + "\nDate of Birth: " +DateBirth+ "\nPhone Number:" +PhoneNo + "\nNominee Name :" +NomineeName + "\nBalance:" +Balance;
	}	

}

