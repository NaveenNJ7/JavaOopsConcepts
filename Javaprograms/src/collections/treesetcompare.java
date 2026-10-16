package collections;

public class treesetcompare {

	
	public static void main(String[] args) {
		
	  Integer x = 10; // we need to write wrapper classes to compare bcoz in collection we can use only
	  Integer y = 20; // non primitive . if we write int x = 10; it gives error.
	  
	  System.out.println(x.compareTo(y));  
	  System.out.println(y.compareTo(x));
	  System.out.println(x.compareTo(x));
	  
	  System.out.println("------------");
	  
	  Double m = 5.06;
	  Double n = 15.66;
	  
	  System.out.println(m.compareTo(n));
	  System.out.println(n.compareTo(n));
	  System.out.println(n.compareTo(m));
	  
	  System.out.println("------------");
	  
	  String a = "A";
	  String b = "C";
	  
	  System.out.println(a.compareTo(b));
	  
	  
	  	}
}
