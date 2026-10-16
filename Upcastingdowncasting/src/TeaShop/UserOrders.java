package TeaShop;

import java.util.Scanner;

public class UserOrders {

	public static void main(String[] args) {
		
		
		Order o  =new Order();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu list\nSelect\n1.Tea\n2.Coffee\n3.Juice");
		int choice = sc.nextInt();
		Shop item = o.menu(choice); // Shop item = new Tea(); upcasting
		
		if(item instanceof Tea)
		{
			System.out.println("Downcast to access properties of subclass");
			Tea t = (Tea) item;
			System.out.println("Order is :"+t.name+" price :"+t.price);
		}
		else if(item instanceof Coffee)
		{
			System.out.println("Downcast to access properties of subclass");
			Coffee c = (Coffee) item;
			System.out.println("Order is :"+c.name+" price :"+c.price);
		}
		else if(item instanceof Juice)
		{
			System.out.println("Downcast to access properties of subclass");
			Juice j = (Juice) item;
			System.out.println("Order is :"+j.name+" price :"+j.price);
		}
	
	}
}
