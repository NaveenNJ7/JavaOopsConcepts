package Stroingobjects;

public class Labour {
	
	String name;
	int salary;
	
	//alt+shift+s
	
	Labour(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Name of perosn :"+this.name+" and his perday Salary :"+this.salary;
	}
	
	public static void main(String[] args) {
		
		Labour l1 = new Labour("John", 200);
		Labour l2 = new Labour("Cena", 300);
		Labour l3 = new Labour("Mike", 400);
		
		Labour[] l = {l1, l2, l3}; // declaring directly
		
		for(int i=0; i<l.length; i++)
		{
			System.out.println(l[i]);
			System.out.println(l[i].hashCode());
			System.out.println("----------");
		}
	}
	
	

}
