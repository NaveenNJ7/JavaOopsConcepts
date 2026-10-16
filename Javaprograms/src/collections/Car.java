package collections;

public class Car implements Comparable<Car> {

	int cost;
	
	Car(int cost)
	{
		this.cost = cost;
	}
	
	public String toString()
	{
		return "Cost of Car : "+cost; 
	}
	/* Here cost is int but return type is String, if you concatenate anything with String 
	   it behave as a String
	 */
	
	public int compareTo(Car c)
	{
		return this.cost - c.cost;
	}
}
