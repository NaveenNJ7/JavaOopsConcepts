package day34_08_11;

public class Account {

	
	private static Account user;
	private Account()
	{
		System.out.println("Welcome to Canara bank");
	}
	
	public static void bank()
	{
		if(user == null)
		{
			System.out.println(user);
		user = new Account();
		System.out.println(user);
		}
		
	}
}
