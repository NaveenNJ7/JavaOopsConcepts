package day34_08_11;

public class Primeminister {

	String name = "Modi";
	
	static Primeminister pm;
	private Primeminister()
	{
		System.out.println("Prime minister got elected");
	}
	
	public static Primeminister method()
	{
		if(pm == null) {
			System.out.println("Lokasabha election 2024");
		
		    pm = new Primeminister();
		}
		return pm;
	}
}
