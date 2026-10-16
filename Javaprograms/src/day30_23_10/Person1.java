package day30_23_10;

public class Person1 {

	
	@Override
	public String toString()
	{
		return "Success";
	}
	
	public static void main(String[] args) {
		
		Person1 p = new Person1();
		/* 
		  bcoz we are overridden method here so 
		  here if we print object reference it will call toString method and this method is returning 
	      "Success" so we will get out put as "Success", 
	      suppose if we are not overridden means result will be default implementation will get executed that is adress 
	      
	    */
		
		System.out.println(p);
		System.out.println(p.toString());
	}
}
