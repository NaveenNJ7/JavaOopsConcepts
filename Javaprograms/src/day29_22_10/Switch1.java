package day29_22_10;

import java.util.Scanner;
public class Switch1 {

	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter number");
			int a = s.nextInt();
			switch(a)
			{
			case 1:
					System.out.println("ch1");
					break;
			case 2:
					System.out.println("ch2");
					break;
			case 3:
					System.out.println("ch3");
					System.exit(0);
					
			default:
					System.out.println("invalid");
					
			}
		}
	}
}
