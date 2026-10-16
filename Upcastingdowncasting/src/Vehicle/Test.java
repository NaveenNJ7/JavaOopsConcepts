package Vehicle;

public class Test {

	
	public static void main(String[] args) {
		
		
		/* Car c = new Car();
		   Father f = new Car();
		 */
		
		Bike bk =  new Bike();
		Car c=bk;
		c.cr();
		c.simply(); //overridden method will execute
		
		//if we want without overridden method from super class, use super key word in simply() [subclass]
		
		//we can not access bk() method with c.bk() because it is superclass reference
		System.out.println("Car name :"+c.cname);
		System.out.println("------------");
		
		//with subclass object can access both methods and variable because Bike inherits Car
		bk.cr();
		bk.bk();
		bk.simply(); //overridden method will execute
		
		
		Bike b = (Bike) c;
		
		System.out.println("Car name :"+b.cname+" and Bike name :"+b.bname);
		b.cr();
		b.bk();
		
		
		
		
		
	}
}
