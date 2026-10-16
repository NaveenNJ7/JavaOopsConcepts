package day3;

public class Operatorsdemo 
{
public static void main(String args[])
{
	int a = 40;
	int b = 20;
	
	//Arithmetic operators +,-,*,/,%
	
	int result = a+b;
	System.out.println("The sum of a and b is"+" "+"="+" "+(a+b)); //or
	System.out.println("a+b"+" "+"="+" "+(result));

	a=30;
	int result1 = a*b;
	System.out.println("Multiplication of a and b"+" "+"="+" "+(a*b)); //or
	System.out.println("a*b"+" "+"="+" "+(result1));
	
    a=40;
	int result2 = a-b;
	System.out.println("Substraction of a and b"+" "+"="+" "+(a-b)); //or
	System.out.println("a-b"+" "+"="+" "+(result2));
	
	
	result = a/b;
	System.out.println("Division of a and b"+" "+"="+" "+(a/b)); // slash gives result of quotient or
	System.out.println("a/b"+" "+"="+" "+(a/b));
	
	
	int result4 = a%b;
	System.out.println("Modulo division of a and b"+" "+"="+" "+(a%b)); //% gives result of reminder or
	System.out.println("a%b"+" "+"="+" "+(result4));
	
	System.out.println("-----------------------------------------------");
	
	
	//Relational or Conditional operators <,>,=,<=,>=,!=,==
	
	a = 50;
	b = 45;
	
	System.out.println("a is greater thatn b"+" "+(a>b));
	
	boolean c = a>b;
	
	System.out.println("or");
	
	System.out.println("a>b"+"  "+(c));
	
	
	System.out.println("b is greater than a"+" "+(b>a));
	
	c = b>a;
	
	System.out.println("or");
	
	System.out.println("b>a"+"  "+(c));
	
	System.out.println("a is less than b"+" "+(a<b));
	
	boolean d = a<b;
	
	System.out.println("or");
	
	System.out.println("a<b"+"  "+(d));
	
	
	System.out.println("a is equal to b"+" "+(a==b));
	
	d=(a==b);
	
	System.out.println("or");
	
	System.out.println("a==b"+"  "+(d));
	
	
	System.out.println("a is greater than or eqaul to b "+" "+(a>=b));
	
	d=(a>=b);
	
	System.out.println("or");
	
	System.out.println("a>=b"+"  "+(d));
	
	
	System.out.println("a is not equal to b"+" "+(a!=b));
	
	boolean e = a!=b;
	
	System.out.println("or");
	
	System.out.println("a!=b"+"  "+(e));
	
	
	System.out.println("------------------------------------------------");
	
	
	//logical operators && (and), || (or), !(not)
	
	int z = 25;
	int y = 35;
	
	boolean m = z<y;
	boolean n = y>z;
	
	System.out.println(m&&n);
	
	System.out.println((25>35)&&(35<25));
	
	System.out.println("----------");
	
	System.out.println((25>35)||(25<35));
	
	System.out.println((25>35)||(35<25));
	
	System.out.println("-----------");
	
	System.out.println(!m);
	
	System.out.println(!n); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
