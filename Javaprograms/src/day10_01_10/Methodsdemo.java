package day10_01_10;

public class Methodsdemo {
	
	// method- without arguments and without return
	
	void demo()
	{
		System.out.println("Method without arguments and without return");
	}
	
	public static void main(String[] args)
	{
		// non static create object
		
		Methodsdemo dummy = new Methodsdemo();
		
		dummy.demo();
				
	}

}
