package Practice;

public class PracticeDemo {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		System.out.println("Length of String "+s.length()); //8
		
		s.concat("Java");
		
		System.out.println("String is immutable in nature original value wont change : "+s);
		
		System.out.println(s.concat(" with Java"));
		
		System.out.println(s.charAt(4)); //n
		
		System.out.println(s.substring(4, 8));
		
		String w = " World ";
		
		System.out.println(w.trim()); 
		
		System.out.println(s.toCharArray());
		
		char[] d= s.toCharArray();
		
		for(char c:d) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String s1="Java";
		String s2="Java";
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //true
		
		String s3= new String("Java");
		
		System.out.println(s1==s3); //false compare object reference
		System.out.println(s1.equals(s3)); //true compares values of object
		
		String s4=s3;  // both s3 and s4 pointing towards same obejct
		System.out.println(s1==s4);  // false
		System.out.println(s1.equals(s4)); //true
		
		
		String a="abcd@gmail.com";
		String[] a1=a.split("@");
		System.out.println(a1[0]); // abcd
		System.out.println(a1[1]); // gmail.com
		
		String a2[]=a1[1].split("\\."); //for dot use \\
		System.out.println(a2[1]); //com
		
		
		StringBuffer buff=new StringBuffer("Java");
		buff.append("+ Selenium");
		System.out.println("StringBuffer is mutable in nature : "+buff); 
		
		System.out.println(buff.reverse());
		
		StringBuilder build=new StringBuilder("Mava");
		build.append("+ Kava");
		System.out.println("StringBuilder is mutable in nature : "+build);
	}
	
	
}
