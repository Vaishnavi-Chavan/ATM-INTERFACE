package atmproject;
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	void display()
	 {
		System.out.println("Please Select your Bank !!!");
        ArrayList<String> st1=new ArrayList<>();        //  ArrayList 
	st1.add("1. State Bank Of India");                                //  Stream API
	st1.add("2. ICICI Bank");
	st1.add("3. HDFC Bank");
	st1.add("4. Axis Bank Ltd");
	st1.add("5. Kotak Mahindra Bank");
	st1.add("6. Punjab National Bank");
	st1.add("7. Union Bank Of India");
	st1.add("8. IDBI Bank");
	st1.add("9. Canara Bank");
	st1.add("10.Other");
	st1.stream()                                      //  Created stream //Stream
	.forEach(System.out::println);                   //  ForEach method   // 15. Method reference
    System.out.print("Choose Your Bank Number  :");
    Scanner scan=new Scanner(System.in);
            int n1 = scan.nextInt();
            switch(n1)                                           // Switch statement
            {
                case 1:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break; 
                case 2:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 3:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 4:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 5:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 6:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 7:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 8:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 9:
                System.out.print("yehhh!!!!! Your Bank is ready for transcation do following operations");
                break;
                case 10:
                    System.out.print("yehhh!!!!! Enter Your bank Name");
                    break;
            }
            System.out.println();
	}

}
