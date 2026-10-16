package Examples;

public class Primeminister {
	
	String name = "Narendra modi";
	
	private static Primeminister pm;
	
	private Primeminister()
	{
		System.out.println("Got elected");
	}
	
	public static Primeminister display()
	{
		if(pm == null)
		{
		pm = new Primeminister();
		}
		return pm;
	}

}
