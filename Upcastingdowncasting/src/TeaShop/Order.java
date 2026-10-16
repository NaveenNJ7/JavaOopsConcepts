package TeaShop;

public class Order {

	public Shop menu(int choice)
	{
		if(choice==1)
		{
		   Tea t = new Tea();
		   return t;   //Data type of t is Tea or Shop(bcoz Tea extends Shop so)
		
		//	return new Tea(); 
		}
		else if(choice==2)
		{
			return new Coffee();
		}
		else if(choice==3)
		{
			return new Juice();
		}
		else
		{
			System.out.println("Invalid choice\nSelect only above items");
			return null;
		}
	}
}
