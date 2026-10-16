package com;

public class Addition {
	
	// with arguments and without return statements
	
	void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
		System.out.println("Sum of a:"+a+" and b:"+b+" is "+(a+b));
		System.out.println("=========");
	}
	
	public static void main(String[] args) {
		
		Addition A = new Addition();
		A.addition(10, 15);
		A.addition(30, 30);
	}

}
