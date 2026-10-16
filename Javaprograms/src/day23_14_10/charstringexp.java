package day23_14_10;

public class charstringexp {

	
	public static void main(String[] args) {
		
		
		
		System.out.println('A');    // char
		
		System.out.println('A'+'A');  //  + operator ASCII
		
		System.out.println('A'+0);   // + operator ASCII
		
		System.out.println('Z'+0);
		
		System.out.println("A"+20);  // String+number = concatenation
		
		System.out.println("A"+'A');  // String+char = concatenation
		
	
        /* if we write + with number and char , + act as  operator it will ACSII value and number
          
          suppose if we use + with number and string, + act as concatenation 
         
         */
		System.out.println("--------------------------------");
		int a = 97;
		
		char b = (char) a;
		
		System.out.println("Value b : "+b);
		
		char m = 'z';
		
		int y = m;
		
		System.out.println("Value y : "+y);
		
	}
}
