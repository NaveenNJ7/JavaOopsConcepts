package day10_01_10;

public class Methodpractice {

	private char[] practice1;

	// without method arguments and with return statements
	/*int practice()
	{
		return 20;
	}
	
	public static void main(String[] args)
	{
		Methodpractice MP = new Methodpractice();
		
		MP.practice();
		
		int r = MP.practice();
		
		System.out.println(r);
		
		System.out.println("-----------------------------");
	} */
	
	
    String practice1()
    {
    	return "Madhuri";
    }
    
    public static void main(String[] args)
    {
    	Methodpractice mp = new Methodpractice();
    	
    	
    	
    	String name = mp.practice1();
    
    	System.out.println(mp.practice1());
    	
    }
}
