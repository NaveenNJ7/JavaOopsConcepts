package day15_06_10;

public class Example0 {

	// parameterized custom constructor - accept arguments
	Example0(int cost)
	{
		System.out.println("Cost of the bike is "+cost);
	}
	
	public static void main(String[] args) {
		
		Example0 Bike = new Example0(125000);
		
		Example0 b = new Example0(130000);
	}
}
