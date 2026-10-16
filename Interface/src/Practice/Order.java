package Practice;

public class Order implements Menu {

	public void items()
	{
		System.out.println("Hotel name is :"+Hotel.name+" and Items are available");
	}
	
	public void dish()
	{
		System.out.println(Menu.item+" is available and price is :"+Menu.price);
	}
	
	public static void main(String[] args) {
		
		Order o  = new Order();
		o.items();
		o.dish();
	}
}
