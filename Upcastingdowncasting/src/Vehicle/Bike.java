package Vehicle;

public class Bike extends Car {

	
	String bname = "Xpulse";
	
	void bk()
	{
		System.out.println("Bike name is :"+bname);
	}
	
	@Override
	void simply() {
		System.out.println("Overridden method");
		super.simply();
	}
}
