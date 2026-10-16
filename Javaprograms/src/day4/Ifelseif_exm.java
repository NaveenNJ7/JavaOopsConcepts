package day4;

public class Ifelseif_exm
{
	
	public static void main(String[] args)
	
	{
		
		int Marks = 718;
		
		if(85<=Marks && Marks<=100)
			
		{
			
		 System.out.println("Distinction");
		 
		}
		
		else if(60<=Marks && Marks<=84)
			
		{
			System.out.println("First class");
	    }
		
		else if(35<=Marks && Marks<=59)
			
		{
			System.out.println("Second class");
		}
		
		else if(Marks>100)
		
		{
			System.out.println("Inavalid");
		}
		
		else if(Marks<0)
			
		{
			System.out.println("Fail");
		}
		
		else if(Marks<=34)
			
		{
			System.out.println("Fail");
		}
	}
}
