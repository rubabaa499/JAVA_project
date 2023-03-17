import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Bank extends Account
{
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		
		FileWriter fw = null; 
		BufferedWriter bw = null; 
		PrintWriter pw = null;
		
		int ch;		
		do 
		{
			System.out.println();
			System.out.println("\t\t\tBANK");
			System.out.println("Main Menu:");
			System.out.println(" 1. Create a new account");
			System.out.println(" 2. Show Account Info.");
			System.out.println(" 0. Exit");
						
			System.out.println("Enter your choice: ");
						
			ch=obj1.nextInt();
			
			switch(ch)
			{
				
				case 1: 
					
					int n;
					do
					{
						System.out.println();
						System.out.println("\t\tChoose Account Type");
						System.out.println("1. Credit Account");
						System.out.println("2. Debit Account");
						System.out.println("3. Savings Account");
						System.out.println("0. Back");
						
						System.out.println("Enter Your Choice: ");

					n=obj1.nextInt();
						
					switch(n)
					{
						case 1:
							CreditAccount ac1 = new CreditAccount();
		
								ac1.CreateAccount();
															
						
								try {
									fw = new FileWriter(ac1.Idgenerator()+".txt",  true);
									String an=(ac1.Idgenerator());
									bw = new BufferedWriter(fw);
									pw = new PrintWriter(bw); 
									
									System.out.println("\nYour Account Created Successfully");
									System.out.println("Account No: "+an);
									
									pw.println("-\tAccount Type: 'CREDIT'"); 
									
									pw.println(ac1.toString()); 
									pw.println(ac1.Deposit());
									pw.println(ac1.Withdraw());
									pw.flush();
									
									pw.close(); 
									bw.close(); 
									fw.close();
									
									}
									
									catch 
										(IOException e) 
										{
											System.out.println("\nAn Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
									
									
									
							break;
							
						case 2:
							DebitAccount ac2 = new DebitAccount();
		
								ac2.CreateAccount();
															
						
								try {
									fw = new FileWriter(ac2.Idgenerator()+".txt",  true);
									String an=(ac2.Idgenerator());
									bw = new BufferedWriter(fw);
									pw = new PrintWriter(bw); 
									
									System.out.println("\nYour Account Created Successfully");
									System.out.println("Account No: "+an);
									
									pw.println("-\tAccount Type: 'DEBIT'"); 
									
									pw.println(ac2.toString()); 
									pw.println(ac2.Deposit());
									pw.println(ac2.Withdraw());
									pw.flush();
									
									pw.close(); 
									bw.close(); 
									fw.close();
									
									}
									
									catch 
										(IOException e) 
										{
											System.out.println("\nAn Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
									
									
									
							break;
							
						case 3:
							SavingsAccount ac3 = new SavingsAccount();
		
								ac3.CreateAccount();
						
												
								try {
									fw = new FileWriter(ac3.Idgenerator()+".txt",  true);
									String an=(ac3.Idgenerator());
									bw = new BufferedWriter(fw);
									pw = new PrintWriter(bw); 
									
									System.out.println("\nYour Account Created Successfully");
									System.out.println("Account No: "+an);
									
									pw.println("-\tAccount Type: 'SAVINGS'"); 
									
									pw.println(ac3.toString()); 
									pw.println(ac3.Deposit());
									pw.println(ac3.Withdraw());
									pw.flush();
									
									pw.close(); 
									bw.close(); 
									fw.close();
									
									}
									
									catch 
										(IOException e) 
										{
											System.out.println("\nAn Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
										break;
										
							}
					
					}
					while (n!=0);
					break;
					
					
				case 2:
					try {
						
						System.out.println(" Enter Your Account ID No: ");
				
						String num5=obj1.next();
						System.out.println();
						
					        File Object = new File(num5+".txt");
					        Scanner myReader = new Scanner(Object);
					        while (myReader.hasNextLine()) 
						      {
							String data = myReader.nextLine();
							System.out.println(data);
							}
					        myReader.close();
						} 
						catch (FileNotFoundException e) 
						{
						      System.out.println("\nAn Error Occurred.");
						      e.printStackTrace();
						}
						
					break;
			}	
		} 
		while (ch!=0);
	}	
	

}