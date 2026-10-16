package day5_23_09;

public class Matrimony {
	
	public static void main(String[] args)
	{
		
		String Gender = "Male";
		
		int age = 19;
		
		
		if(Gender=="Male")
		{
			System.out.println("Gender is Male");
			
			if(age>=21)
			{
				System.out.println("Eligible for marriage");
			}
			else
			{
				System.out.println("Not eligible for marriage");
			}
		}
		
		else if(Gender=="Female")
		{
			System.out.println("Gender is Female");
			
			if(age>=18)
			{
				System.out.println("Eligible for marriage");
			}
			
			else
			{
				System.out.println("Not eligible for marriage");
			}
			
	
		}
		
		else
		{
			System.out.println("Invalid data");
		}
		
	
	}

}
