package Practice;

import java.util.Arrays;

public class MethodsDemo {

	public static void main(String[] args) {
		
		
		// These methods used only for String type of data type
		
		String  s = "Java";
		String s1 = "Python";
		String s2 = "Java Script";
		
		// lenght of String
		System.out.println("Length of String :"+s.length());
		
		
		// concate
		System.out.println(s.concat(s1));
		System.out.println("Do well".concat("Do hard work"));
		System.out.println(s.concat(s1+s2));
		System.out.println(s.concat(" and "+s2));
		System.out.println(s.concat(" "+s2));
		
		//contains
		System.out.println(s2.contains(s)); // true
		System.out.println(s2.contains("S")); // true
		System.out.println(s2.contains("Script")); // true
		System.out.println(s.contains("j")); // false
		
		
		// trim()
		String m = " Rakshit "; // contains space after and before space
		System.out.println(m); // it will give output with space
		System.out.println(m.trim()); // it will give output without space after and before string
		
		// substring
		String n = "Ravi";
		// index position 2(v) onwards till last index position it will give output
		System.out.println(n.substring(2));
		System.out.println(n.substring(0));
		System.out.println(n.substring(3));
		
		/*
		 below starting index is 2 (but for this index position of R starts from 0
		       ending index is 4 (but for this index position of R starts from 1 
		 */
		String o = "$Trump";
		System.out.println(n.substring(2, 4)); //vi
		System.out.println(o.substring(1,6)); //Trump
		
		// replace()
		System.out.println(o.replace('$','D'));
		
		String p = "aTrump";
		System.out.println(p.replace("a", "Donald ")); // after Donald gave one space
		// cant mention a in single quote bcoz both arguments should be either in single or double
		
		// split()
		String a = "dummy777@gmail.com";
		String b[] = a.split("@");
		System.out.println(b[0]); //dummy777
		System.out.println(b[1]); //gmail.com
		System.out.println(Arrays.toString(b));
	
	//	String c[] = a.split("."); // should use \\ for dot (it wont give output or exception wil give)
		String c[] = a.split("\\.");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		String f = "abc,efg@gamil.com";
		System.out.println(f);
		String a1[] = f.split(",");
		System.out.println(Arrays.toString(a1));
		
		// a1[1] contains efg@gmail.com so split this
		String a2[] = a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		
		//a2[1] contains gmail.com
		 String a3[] = a2[1].split("\\.");
		 System.out.println(Arrays.toString(a3));
		
		 // toUpperCase()
		 String g = "House";
		 System.out.println(g.toUpperCase());
		 
		 // toLowerCase()
		 String G = "HOmE";
		 System.out.println(G.toLowerCase());
		 
		 // equals() and equalsIgnoreCase()
		String e = "Equal";
		System.out.println(e.equals("Equal")); // True
		System.out.println(e.equalsIgnoreCase("equal")); // True
		
		// indexOf()
		System.out.println(e.indexOf("a"));
		
	}
}
