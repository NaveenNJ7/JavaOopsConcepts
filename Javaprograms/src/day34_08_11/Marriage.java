package day34_08_11;

public class Marriage {

	
	int age = 21;
	
	private static Marriage m;
	
	private Marriage()
	{
		System.out.println("Eligible for marriage");
	}
	
	public static Marriage method()
	{
		if(m == null)
		{
		 m = new Marriage();
		}
		return m;
	}
}
