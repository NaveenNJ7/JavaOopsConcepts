package DataConversion;

public class StringToPrimitive {

	public static void main(String[] args) {
		
		// scenario-1 String is non primitive type
		String i = "10";
		String I = "20";
		System.out.println("Before converting to Primitive :"+i+I+" it will concat"); //1020
		
		//conversion
		int n = Integer.parseInt(i);
		int m = Integer.parseInt(I);
		System.out.println("After converting to Primitive :"+(m+n)+" it will not concat"); //30
		
		System.out.println(Integer.parseInt("20")+Integer.parseInt("30")); //50
		
		String d = "10.5";
		String D = "20.5";
		System.out.println(Double.parseDouble(d)+Double.parseDouble(D)); //31.0
		
		//String to char we cant, bcoz String contains multiple characters, char holds only 1 character
		
		String b = "true"; 
		// instead of true if we send any String value it will give false( examples "abc","ghk")
		System.out.println(Boolean.parseBoolean(b));
		
	}
}
