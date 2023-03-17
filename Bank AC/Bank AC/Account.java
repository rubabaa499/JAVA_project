import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
 
class Account
{
	protected String name;
	static int count =0;
	protected String id;
	protected String dob;
	protected String nominee;
	protected double balance;
	
	
	
	static String Idgenerator()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-");
		Date date=new Date();
		return (formatter.format(date)+Account.count++);
	
	}
	
	Scanner obj= new Scanner(System.in);
	
	protected Account()
	{
		this.id=Account.Idgenerator();
		this.name="";
		this.dob="";
		this.nominee="";
		this.balance=0d;
	}
	

	protected void CreateAccount()
	{
                this.id = Account.Idgenerator();
                System.out.println("Enter Your Name: ");
		this.name=obj.nextLine();
                System.out.println("Enter Date Of Birth: ");
		this.dob = obj.nextLine();
		System.out.println("Enter Nominee Name: ");
		this.nominee=obj.nextLine();
                System.out.println("Enter Balance: ");
		this.balance=obj.nextDouble();
		
	}

	
		
	public String toString()
	{
		return "Name:" +this.name + "\nID: " +id + "\nDate of Birth: " +this.dob+ "\nNominee:" +this.nominee + "\nBalance:" +this.balance;
	}	
		
}

