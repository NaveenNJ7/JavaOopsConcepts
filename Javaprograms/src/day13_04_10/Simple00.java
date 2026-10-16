package day13_04_10;

import java.util.Scanner;
public class Simple00 {

	
	int id = 352;
	
	String name = "Navin";
	
	int c = 10;
	int d = 20;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Simple00 non = new Simple00();
		
		int i = 1;
		
		for(i=1; i<=3; i++)
		{
		
		System.out.println("Enter value of a");
		
		int a = sc.nextInt();
		
		System.out.println("Enter value of b");
		
		int b = sc.nextInt();
		
		Simple0.m0(a, b);
		
		}
		
		sc.close();
		
		non.id = 352;
		
		non.name = "Navin";
		
		System.out.println("Name : "+non.name+" and id number : "+non.id);
		
		non.c = 10;
		
		non.d = 20;
		if(non.c>non.d)
		{
			System.out.println(non.c+" is greater than "+non.d);
		}
		else
		{
			System.out.println(non.d+" is greater than "+non.c);
		}
	}
}
