package Restuarants;

public class UserOrders {

	public static void main(String[] args) {
		
		
		Hotel h = new Hotel();
		Order obj = h.hotel(3);
		if(obj instanceof Idly)
		{
			Idly i = (Idly) obj;
			System.out.println("Ordered idly :"+i.plate+" plate and price :"+i.price);
		}
		else if(obj instanceof Dosa)
		{
			Dosa d = (Dosa) obj;
			System.out.println("Ordered dosa :"+d.plate+" plate and price :"+d.price);
		}
		else
		{
			Vada v=(Vada) obj;
			System.out.println("Ordered vada :"+v.plate+" plate and price :"+v.price);
		}
	}
}
