package day25_17_10;

public class Testvehical {

	public static void main(String[] args) {
		
		Vehical v = new Car();
		
		System.out.println("Brand name is : "+v.brand);
		if(v instanceof Bike)
		{
			Bike b = (Bike) v;
			System.out.println("Bike cost is : "+b.cost);
		}
		
		else if(v instanceof Car)
		{
			Car c = (Car) v;
			System.out.println("Car cost is : "+c.cost);
		}
	}
}
