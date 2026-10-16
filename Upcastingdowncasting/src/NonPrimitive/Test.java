package NonPrimitive;

public class Test {

	public static void main(String[] args) {
		
		// upcasting
		Bike b = new Bike ();
		 Car c= new Car();
		 Vehicle v = b;
		System.out.println("Vehicle name :"+v.brand);
		
		if(v instanceof Bike)
		{
			System.out.print("Vehicle is instance of Bike"+"  ");
			System.out.println(v instanceof Bike);
			System.out.println("Downcast to Bike");
			 b = (Bike)v;
			System.out.println("Bike brand :"+b.brand+" and price :"+b.price);
		}
		else if(v instanceof Car)
		{
			System.out.print("Vehicle is instance of Car :"+" ");
			System.out.println(v instanceof Car);
			System.out.println("Downcast to Car");
			 c = (Car)v;
			System.out.println("Car brand :"+c.brand+" and price :"+c.brand);
		}
		
		
		
	}
}
