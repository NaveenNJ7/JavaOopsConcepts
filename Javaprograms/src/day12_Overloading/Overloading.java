package day12_Overloading;


import java.util.Scanner;
public class Overloading {

	public static void main(String[] args) {
		 
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		
		int c = scan.nextInt();
		
		System.out.println("Entet value of b");
		
		int d = scan.nextInt();
		
		int e = (c+d);
		
		System.out.println(e);
		
		scan.close();
	}
}
