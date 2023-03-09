package atmproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Atmtrans {

	public static void main(String[] args) {
		
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vaishudb","root","vairac@123");
				Statement st=(Statement) conn.createStatement();
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Hey welcome to the world of ATM Machine");
				System.out.println("Enter your atm number");
				int atmNumber=sc.nextInt();
				System.out.println("Enter your atm pin");
				int atmPin=sc.nextInt();
				int acc_no=1234;
				if((atmNumber==atmNumber)&&(atmPin==acc_no)) {  
				ResultSet rset=st.executeQuery("select * from atmdetails where acc_no="+atmPin);
				Accountholder h1=new Accountholder();
				h1.identity();
				System.out.println("You are in right track");
				String name=null;
				int balance=0;
				int count=0;
				while(rset.next())
				{
					name=rset.getString(3);
					balance=rset.getInt(4);
					count++;//System.out.println(rset.getString(1)+"           "+rset.getString(2)+"                "+rset.getString(3)+"                "+rset.getString(4)); 
				}
				int withdraw, deposit;
				System.out.println("Please Select your country !!!");
		        ArrayList<String> st1=new ArrayList<>();        //  ArrayList 
			st1.add("1. India");                                //  Stream API
			st1.add("2. America");
			st1.add("3. Japan");
			st1.add("4. Bhutan");
			st1.add("5. Canada");
			st1.add("6. Kenya");
			st1.add("7. Germany");
			st1.add("8. Mexico");
			st1.add("9. Norway");
			st1.stream()                                      //  Created stream //Stream
			.forEach(System.out::println);                   //  ForEach method   //  Method reference
		    System.out.print("Choose Your Country Number :");
		            int n1 = sc.nextInt();
		            switch(n1)                                           // Switch statement
		            {
		                case 1:
		                System.out.print("yehhh!!!!! Your Currency Is Rupeess");
		                break; 
		                case 2:
		                System.out.print("yehhh!!!!! Your Currency Is Dollar");
		                break;
		                case 3:
		                System.out.print("yehhh!!!!! Your Currency Is Yen");
		                break;
		                case 4:
		                System.out.print("yehhh!!!!! Your Currency Is Ngultrum");
		                break;
		                case 5:
		                System.out.print("yehhh!!!!! Your Currency Is Dollar");
		                break;
		                case 6:
		                System.out.print("yehhh!!!!! Your Currency Is Shilling");
		                break;
		                case 7:
		                System.out.print("yehhh!!!!! Your Currency Is Euro");
		                break;
		                case 8:
		                System.out.print("yehhh!!!!! Your Currency Is Peso");
		                break;
		                case 9:
		                System.out.print("yehhh!!!!! Your Currency Is Norwegian Krone");
		                break;
		            }
		            System.out.println();
		        //System.out.print("Enter Your Atm Number : ");                  // Print ATM number
		        //int atmNumber=sc.nextInt();                                     //  Scan the next input
		        //System.out.print("Enter Your Pin: ");                          // Print Pin
		        //int pin=sc.nextInt();
		            Bank b=new Bank();
		            b.display();
		            //if(count>0)
		            //int acc_no=1234;
		            //if((atmNumber==atmNumber)&&(atmPin==acc_no)) {  
		        	System.out.println("Hello"+name);//20. If statement    0r // 21.AND logical operator            
		        while(true)                                           // 22. While loop
		        {
		            System.out.println("Automated Teller Machine");
		            System.out.println("Choose 1 for Withdraw");
		            System.out.println("Choose 2 for Deposit");
		            System.out.println("Choose 3 for Check Balance");
		            System.out.println("Choose 4 for EXIT");
		            System.out.print("Choose the operation you want to perform:");
		            int n = sc.nextInt();
		            switch(n)                                           // Switch statement
		            {
		                case 1:
		                System.out.print("Enter money to be withdrawn:");
		                withdraw = sc.nextInt();
		                if(balance >= withdraw)                         //  If else statement
		                {
		                    balance = balance - withdraw;           //  Checking balance using arithmetic operator
		                    System.out.println("Please collect your money");
		                }
		                else                            // if condition not true then else part will be executed
		                {
		                	int sub=st.executeUpdate("Update list set balance="+balance+"Where acc_no ="+atmPin);
		                    System.out.println("Insufficient Balance");
		                }
		                System.out.println("");
		                break;        // Break-Terminate the processing of a particular case within a switch statement
		 
		                case 2:
		                System.out.print("Enter money to be deposited:");
		                deposit = sc.nextInt();
		                balance = balance + deposit; 
		                int bal=st.executeUpdate("Update list set balance="+balance+"Where acc_no ="+atmPin);//check condition
		                System.out.println("Your Money has been successfully depsited");
		                System.out.println("");
		                break;
		 
		                case 3:
		                System.out.println("Balance : "+balance);
		                System.out.println("");
		                break;
		 
		                case 4:
		                System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
		                System.exit(0);
		            }
		        }
		            }
		        else{                     //If ATM number not matches the else part will be executed
		            System.out.println("Incorrect Atm pin!! please try again");
		            System.exit(0);
		        }
	
		    
		
			} catch (Exception e) 
			{
				System.out.println("The error are:   " + e);
			}

		}

	}