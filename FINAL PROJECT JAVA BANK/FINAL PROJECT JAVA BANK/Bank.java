import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;





import mypackage.*;
import mypackageA.*;
import mypackageB.*;
import mypackageC.*;
import mypackageD.*;



public class Bank extends Account
{
	public static void main(String[] args)
	{
		
		
		Scanner a1=new Scanner(System.in);


		int ch;		
		do
		{
			System.out.println();
			System.out.println("                 WELCOME TO THE BANK");
			System.out.println("                       M E N U ");
			System.out.println(" # PRESS '1' TO CREATE AN ACCOUNT");
			System.out.println(" # PRESS '2' TO DEPOSITE MONEY");
            System.out.println(" # PRESS '3' TO WITHDRAW MONEY");
            System.out.println(" # PRESS '4' TO TRANSFER MONEY");			
			System.out.println(" # PRESS '5' TO SHOW ACCOUNT INFORMATION");
			System.out.println(" # Press '0' EXIT THE SYSTEM");
						
			System.out.println("ENTER YOUR CHOICE: ");
						
			ch=a1.nextInt();
			
			if(ch==1)
			{
				
				 
					
					int n;
					do
					{
						System.out.println();
						System.out.println("                        CHOOSE YOUR ACCOUNT ");
						System.out.println("1. Credit Account");
						System.out.println("2. Debit Account");
						System.out.println("3. Savings Account");
						System.out.println("4. Fixed Account");
						System.out.println("0. Back");
						
						System.out.println("ENTER YOUR CHOICE: ");

					    n=a1.nextInt();
						
					    if(n==1)
					    {
					 	
							Account ac1 = new Account();
		
								ac1.CreateAccount();
                                try {
									File f = new File(AcNo+("_CreditAccount.txt"));
									FileWriter fw = new FileWriter(f,true);
									System.out.println("\nYou have successfully created your CREDIT account");
									fw.write("CREDIT Account Created"); 
									fw.write(ac1.ShowAccount());
									fw.flush();
									fw.close(); 
								
									}
									
									catch 
										(IOException e) 
										{
											System.out.println("An Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
					    }	
						if(n==2)
						{
							Account ac2 = new Account();
		
								ac2.CreateAccount();
								    try 
								{
									File f = new File(AcNo+("_DebitAccount.txt"));
									FileWriter fw = new FileWriter(f,true);
									System.out.println("\nYou have successfully created your DEBIT account");
									fw.write("DEBIT Account Created"); 
									fw.write(ac2.ShowAccount());
									fw.flush();
									fw.close(); 
								}
									
									catch 
										(IOException e) 
										{
											System.out.println("An Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
						}
						if(n==3)
						{
							Account ac3 = new Account();
		
								ac3.CreateAccount();
								    try 
								{
									File f = new File(AcNo+("_SavingAccount.txt"));
									FileWriter fw = new FileWriter(f,true);
									System.out.println("\nYou have successfully created your SAVING account");
									fw.write("SAVING Account Created"); 
									fw.write(ac3.ShowAccount()); 
									fw.flush();
									fw.close(); 

								}
									
									catch 
										(IOException e) 
										{
											System.out.println("An Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
						}
						if(n==4)
						{
							Account ac4 = new Account();
		
								ac4.CreateAccount();
								    try 
								{
									File f = new File(AcNo+("_FixedAccount.txt"));
									FileWriter fw = new FileWriter(f,true);
									System.out.println("\nYou have successfully created your FIXED account");
									fw.write("FIXED Account Created"); 
									fw.write(ac4.ShowAccount()); 
									fw.flush();
									fw.close(); 

								}
									
									catch 
										(IOException e) 
										{
											System.out.println("An Error Occured");
											System.out.println("Please Try Again");
											e.printStackTrace();
										}
						}

						
                    }
					while (n!=0);							
			}

			if(ch==2)
			{
				
				
					int n;
					do
					{
					
						System.out.println();
						System.out.println("                ENTER YOUR CHOICE:");
						System.out.println("# PRESS '1' Deposit Money To Credit Account");
						System.out.println("# PRESS '2' Deposit Money To Debit Account");
						System.out.println("# PRESS '3' Deposit Money To Savings Account");
						System.out.println("# PRESS '0' Back");
						
						System.out.println("ENTER YOUR CHOICE: ");

					    n=a1.nextInt();
						
					    if(n==1)
					    {
                             CreditAccount cr = new CreditAccount();
						     cr.Deposit();
							 try 
							{
									File f = new File("CreditAccountDeposit.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("\nCREDIT ACCOUNT: DEPOSIT"); 
									fw.write(cr.ShowCredit());
									
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
					    }	
						if(n==2)
						{
							DebitAccount da = new DebitAccount();
						     da.Deposit();
							 try 
							{
									File f = new File("DebitAccountDeposit.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("\nDEBIT ACCOUNT: DEPOSIT"); 
									fw.write(da.ShowDebit());
									
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
						}
						if(n==3)
						{
							SavingsAccount sa = new SavingsAccount();
						     sa.Deposit();
							 try 
							{
									File f = new File("SavingAccountDeposit.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("\nSAVING ACCOUNT: DEPOSIT"); 
									fw.write(sa.ShowSaving());
									
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
						}	
						
					}
					while (n!=0);
			}
			
			
			if(ch==3)
			{
				int n;
					do
					{
						System.out.println();
						System.out.println("                        ENTER YOUR CHOICE:");
						System.out.println("# PRESS '1' Withdraw Money From Credit Account");
						System.out.println("# PRESS '2' Withdraw Money From Debit Account");
						System.out.println("# PRESS '3' Withdraw Money From Savings Account");
						System.out.println("# PRESS '0' Back");
						
						System.out.println("ENTER YOUR CHOICE: ");

					    n=a1.nextInt();
						
					    if(n==1)
					    {
                             CreditAccount cr = new CreditAccount();
						     cr.Withdraw();
							 try 
							{
									File f = new File("CreditAccountWithdraw.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("CREDIT ACCOUNT: WITHDRAWN"); 
									fw.write(cr.ShowCredit());
									
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
					    }
						
						if(n==2)
						{
							 DebitAccount da = new DebitAccount();
						     da.Withdraw();
							 try 
							{
									File f = new File("DebitAccountWithdraw.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("DEBIT ACCOUNT: WITHDRAW"); 
									fw.write(da.ShowDebit());

									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
						}
						
						if(n==3)
						{
							SavingsAccount sa = new SavingsAccount();
						     sa.Withdraw();
							 try 
							{
									File f = new File("SavingAccountWithdraw.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("SAVING ACCOUNT: WITHDRAWN"); 
									fw.write(sa.ShowSaving());
									
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
						}	
					}
					while (n!=0);
			}

			if(ch==4)
			{
			 
			   Transfer T=new Transfer();
	           T.Transfer ();
			      
							try 
							{
									File f = new File("TransferMoney.txt");
									FileWriter fw = new FileWriter(f,true);
									fw.write("Transfer Money"); 
									fw.write(T.ShowTrans());
									fw.flush();
									fw.close(); 
								
							}
								catch 
									(IOException e) 
									{
									System.out.println("An Error Occured");
									System.out.println("Please Try Again");
									e.printStackTrace();
									}
			
			}
			
			
			
			if(ch==5)
			{
			 
			        try {
						
						System.out.println("Enter Your Account No: ");
						String x =a1.next();

					        File file = new File(x+".txt");
					        Scanner z = new Scanner(file);
					        while (z.hasNextLine()) 
						    {
							String text = z.nextLine();
							System.out.println(text);
							}
					        z.close();
						} 
						catch (FileNotFoundException e) 
						{
						      System.out.println("An Error Occurred.");
							  System.out.println("Please Try Again");
						      e.printStackTrace();
						}
			
			}
			

		} 
		while (ch!=0);	
	} 
		
		
}




