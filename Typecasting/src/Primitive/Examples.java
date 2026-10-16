package Primitive;

public class Examples {

	public static void main(String[] args) {
		
		
		// widening
		
		// byte - short-int-long-float-double
		
	int z = 10;
	double d = z;
	
	System.out.println("z :"+z+" and d :"+d);
	
	char m = 'a';
	int n = m;
	
	System.out.println("m :"+m+" and n :"+n);
	
	byte b = 5;
	int i = b;
	
	System.out.println("b :"+b+" and i :"+i);
	
	// narrowing
	
	// double-float-long-int-short-byte
	
	double x = 10.5;
	int y = (int) x;
	
	System.out.println("x :"+x+" and y :"+y);
	
	int a = 65;
	char c = (char) a;
	
	System.out.println("a :"+a+" and c :"+c);
	
	// ASCII value - American standard code for information interchange
    
	
	System.out.println("double quote it is a string :a");
	
	System.out.println("A"+"B");
	System.out.println("A"+20);
	System.out.println('A'+'B'); // 65+66 (a=97)
	System.out.println('a'+20);
	System.out.println('a'+"a");
	char v  ='u';
	System.out.println(v);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
