package ExceptionHandling;


import java.util.Scanner;
public class TestATM {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Canara Bank ATM");
		
		int Balance = 10000;
		
		System.out.println("Enter amount to be draw");
		
		int amt = sc.nextInt();
		
		if(amt<=Balance)
		{
			System.out.println(amt+" amount drwan successfully");
			
			int AVL = Balance - amt;
			
			System.out.println("Available balance : "+AVL);
		}
		
		else
		{
		 try
		 {
			throw new InsufficientbalanceException();
		 }
		 catch( InsufficientbalanceException e)
		 {
			System.out.println("Insufficient balance");
		 }
		}
	}
	}
