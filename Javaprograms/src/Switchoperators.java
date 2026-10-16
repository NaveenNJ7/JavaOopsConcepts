import java.util.Scanner;

public class Switchoperators {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Operators S = new Function();
		
		
		
		while(true)
		{
		System.out.println("Select\n1 : Addition\n2 : Multiplication\n3 : Division");
		int select = scan.nextInt();
		
		switch(select)
		{
		case 1 : 
			System.out.println("Enter values");
			
			System.out.println("Value of a");
			int a = scan.nextInt();
			System.out.println("Value of b");
			int b = scan.nextInt();
			System.out.println("Addition of "+a+" and "+b);
			System.out.println(S.addition(a, b));
			break;
			
		case 2 :
			System.out.println("Enter values of c and d");
			System.out.println("Value of c");
			int c = scan.nextInt();
			System.out.println("Value of d");
			int d = scan.nextInt();
			System.out.println("Multiplication of "+c+" and "+d);
			S.multiplication(c, d);
			System.out.println(S.multiplication(c, d));
			break;
			
		case 3 :
			System.out.println("Enter value of e and f");
			System.out.println("Value of e");
			int e = scan.nextInt();
			System.out.println("Value of f");
			int f = scan.nextInt();
			System.out.println("Division of "+e+" and "+f);
			S.division(e, f);
			System.out.println(S.division(e, f));
			System.exit(0);
		}
		
	}
}
}
