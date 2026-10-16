package Equalsmethod;

public class Labour {

	int salary;
	
	Labour(int salary)
	{
		this.salary = salary;
	}
	
	@Override
	
	public boolean equals(Object obj)
	{
		Labour l = (Labour) obj;
		return this.salary == l.salary;
	}
	
	
	public static void main(String[] args) {
		
		Labour l1 = new Labour(50);
		Labour l2 = new Labour(80);
		
		System.out.println(l1.equals(l2));
		
	}
	
}
