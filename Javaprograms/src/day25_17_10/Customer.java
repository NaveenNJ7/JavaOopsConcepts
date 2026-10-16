package day25_17_10;

public class Customer {
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		Food f = h.items(4);
		    
		if(f instanceof Idly)
		{
			System.out.println("Ordered item is Idly");
		}
		else if(f instanceof Dosa)
		{
			System.out.println("Ordered item is Dosa");
		}
		else
		{
			System.out.println("Ordered item is Palav");
		}
		
		
	}

}
