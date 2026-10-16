package day25_17_10;

public class Hotel {

	Food items(int choice) {
		
		if(choice == 1) 
		{
		    Idly i = new Idly();
		    return i;
		}
		
		else if(choice == 2)
		{
			Dosa d = new Dosa();
			return d;
		}
		else 
		{
			Palav p = new Palav();
			return p;
		}
	
		
	}
	
	
}
