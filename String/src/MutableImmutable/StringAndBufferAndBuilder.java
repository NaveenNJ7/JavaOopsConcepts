package MutableImmutable;

public class StringAndBufferAndBuilder {

	public static void main(String[] args) {

		String s = "Java";
		s.concat(" Selenium");
		System.out.println(s); // prints only Java it wont change - immutable
		
		// in this class we have append() to concat strings
		StringBuffer b = new StringBuffer("Postman");
		b.append(" And RestAssure");
		System.out.println(b);  //Postman And RestAssure  it changes  mutable
		
		// in StringBuilder also we have same method
		StringBuilder B = new StringBuilder("CI");
		B.append(" and CD");
		System.out.println(B); // CI and CD it changes - mutable in nature
		
				
	}

}
