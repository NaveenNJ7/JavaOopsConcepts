package day5_23_09;

public class Nestedifdemo {
	
	public static void main(String[] args)
	{
		
		// nested if, --one if is present over another if
		
		int a = 21;
		
		if(a<20)
		{
			System.out.println(a+" is less than "+20);
			
		    if(a==10)
		    {
		    	System.out.println(a+" is equal to "+10);
		    }
		    else
		    	System.out.println(a+" is not equal to "+10);
		}
		
		else
			System.out.println(a+" greater than "+20);
	}

}
