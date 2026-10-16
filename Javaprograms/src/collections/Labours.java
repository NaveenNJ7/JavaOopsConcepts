package collections;

public class Labours implements Comparable<Labours> {

	int id;
	String name;
	double salary;
	
	Labours(String name, int id, double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "  "+name+" "+"        "+id+"    "+salary;
	}
	
	/*public int compareTo(Labours w)
	{
		return this.id - w.id;
	} */
	
	// descending order
	
	/*public int compareTo(Labours w)
	{
		return w.id - this.id;
	} *\
	
	/* public int compareTo(Labours w)
	{
		return this.name.compareTo(w.name);
	} */
	
	public int compareTo(Labours w)
	{
		return (int) (this.salary - w.salary);
	}
	
	
	
}
