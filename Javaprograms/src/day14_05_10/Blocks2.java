package day14_05_10;

public class Blocks2 {

	
	{
		System.out.println("Non static1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Non static execute while object creation");
		
		System.out.println("They execute in sequential");
		
		Blocks2 bl = new Blocks2();
		
	}
	
	{
		System.out.println("Non static2");
	}
	
	{
		System.out.println("Non static3");
	}
}
