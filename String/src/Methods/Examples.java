package Methods;

public class Examples {

	public static void main(String[] args) {
		
		
		String s = "Naveen Junja";
		
		System.out.println(s.length()); // 12 // even space and dot also consider is as character
		System.out.println("----------");
		
		System.out.println(s.toUpperCase());
		System.out.println("----------");
		
		System.out.println(s.toLowerCase());
		System.out.println("----------");
		
		System.out.println(s.startsWith("Nav")); // true
		System.out.println("----------");
		
		System.out.println(s.startsWith("nav")); // false, java is case sensitive
		System.out.println("----------");
		
		System.out.println(s.endsWith("junja")); // false
		System.out.println("----------");
		
		System.out.println(s.endsWith("Jun")); // false
		System.out.println("----------");
		
		//Naveen Junja
		
		System.out.println(s.contains("Junja")); // true
		System.out.println("----------");
		
		System.out.println(s.contains("A")); // false
		System.out.println("----------");
		
		System.out.println(s.concat(" is Software tester"));
		System.out.println("----------");
		
		System.out.println(s.charAt(0)); //N
		System.out.println("----------");
		
		// if we enter more the characters length it will give class cast exception
		System.out.println(s.charAt(11)); // a
		System.out.println("----------");
		
		System.out.println(s.indexOf('J')); // 7
		System.out.println("----------");
		
		// here we have multiple e letters, but always first occurrence will be the result
		System.out.println(s.indexOf('e')); // 3 
		System.out.println("----------");
		
		String a = "java";
		String b = "Java";
		String c = "java";
		
		System.out.println(a.equals(b)); // false case sensitive
		System.out.println("----------");
		
		System.out.println(a.equals(c)); // true
		System.out.println("----------");
		
		System.out.println(a.equalsIgnoreCase(b)); // true ignore case sensitive
		System.out.println("----------");
		
		String d = "Navin Junja";
		
		System.out.println(d.substring(2)); // vin junja,return begining index position to upto end
		System.out.println("----------");
		
		System.out.println(d.substring(6)); // junja
		System.out.println("----------");
		
		System.out.println(d.substring(0, 7)); // Navin J , 7 index is u, but it will take previous one of that index
		System.out.println("----------"); //return begining index position to upto endIndex-1(0,6)
		
		System.out.println(d.substring(0, 4)); // Navi
		System.out.println("----------");
		
		
		String date = "03-08-2026";

		System.out.println(date.substring(6)); //2026
	
		String str = "ABC12345";
		
		System.out.println("----------");

		System.out.println(str.substring(3)); //12345
		
		String text = "Java Selenium Testing";

		System.out.println(text.substring(5, 13));
		
		System.out.println(text.substring(0, 4));
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
