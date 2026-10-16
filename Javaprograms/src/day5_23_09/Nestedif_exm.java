package day5_23_09;

public class Nestedif_exm {
	
	public static void main(String[] args)
	{
		
		// login and password
		
		String Name = "Naveen";
		
		int Password = 2901;
		
		if(Name=="Naveen")
			
		{
			System.out.println("User name is "+Name);
			
			if(Password==2901)
			{
				System.out.println("Login successfull");
			}
			
			else
				
				System.out.println("Password is not correct");
		}
				
		else
		{
			System.out.println("User name is not found");
		}
		
	}

}
