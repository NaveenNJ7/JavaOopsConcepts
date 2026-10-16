package day29_22_10;


import java.util.Scanner;

public class Customer {
	
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	Bank b = new Branch();
	
	System.out.println("Welcome to ATM");
	
	System.out.println("Select\n1:Deposit amount\n2:Withdraw\n3:Check balance\n4:Exit");
	
	while(true)
	{
		
		
		System.out.println("Enter number");
		int a = s.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Deposit amount");
			int amount = s.nextInt();
			b.deposit(amount);
			break;
		case 2:
			System.out.println("Withdraw amount");
			int wamount = s.nextInt();
			b.withdraw(wamount);
		    break;
		case 3:
			b.checkbalance();
			break;
		case 4 :
			System.out.println("Thank you");
			System.exit(0);
		default :
			System.out.println("Invalid");
		
		}
		
	
	}
	

	}
	
}
