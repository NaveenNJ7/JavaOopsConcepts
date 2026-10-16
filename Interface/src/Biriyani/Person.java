package Biriyani;

public class Person implements Hotel {


	@Override          // access specifier must be sametype or higher visibility
	public void order(String food)
	{
	 System.out.println("Food is :"+food);	
	}
	
	public static void main(String[] args)
	{
		
		Person p = new Person();
		p.order("Biryani");
		
		// price variable is static it is in another so we have to call it with respective class
		System.out.println("Price :"+Hotel.price); // 
		
	}
	
	
	
	
}
