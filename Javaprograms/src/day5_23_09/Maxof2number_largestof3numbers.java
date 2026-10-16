package day5_23_09;

public class Maxof2number_largestof3numbers {
	
	public static void main(String[] args)
	{
		int a = 30;
		
		int b = 51;
		
		int c = 50;
		
		/* if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}*/
		
		//---------------------------------------
				
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
			
			if(a>c)
			{
				System.out.println(a+" is greater than both "+c+" & "+b);
			}
			else
			{
				System.out.println(a+" greater than "+b+" but less than "+c);
			}
		}
		
		else if(b>a)
		{
			System.out.println(b+" is greater than "+a);
			
			if(b>c)
			{
				System.out.println(b+" is greater than both "+c+" & "+a);
			}
			
			else
			{
				System.out.println(b+" is greater than "+a+" less than "+c);
			}
		}
		
		else if(c>a)
		{
			System.out.println(c+" is greater than "+a);
			
			if(c>b)
			{
				System.out.println(c+" is greater than both "+b+" & "+a);
			}
			
			else
			{
				System.out.println(c+" is greater than "+a+" less than "+b);
			}
		}
	}

}
