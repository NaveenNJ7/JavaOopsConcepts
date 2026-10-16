package Restuarants;

public class Hotel {

	public Order hotel(int choice)
	{
		//if choice other than 1 and 2,(numbers like 3,5 or etc) order it will take by default vada
		if(choice==1)
		{
		/*	Idly i = new Idly();
			return i; 
		if we return i, data type of i is Idly, but class Idly extends Order class, so data
		type we can write Order 
		
			int a, return a;  datatype is int so same way return i, Datatype Order or Idly
		*/ 
			return new Idly();   
		}
		else if(choice==2)
		{
		/*	Dosa d = new Dosa();
			return d; */
			return new Dosa();
		}
		else
		{
		/*	Vada v = new Vada();
			return v; */
			return new Vada();
		}
		
			
	}
}
