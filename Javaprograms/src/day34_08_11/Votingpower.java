package day34_08_11;

public class Votingpower {

	
	int age = 18;
	
	private static Votingpower power;
	private Votingpower()
	{
		System.out.println("Parliment election");
	}
	
	public static Votingpower electioncommission()
	{
		if(power == null)
		{
			power = new Votingpower();
			
		}
		return power;
	}
	
}
