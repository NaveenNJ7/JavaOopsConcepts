package Practice;

public class Son implements Father {

	String name = "Cena";
	@Override
	public void m(int age)
	{
		System.out.println("Father name is :"+Father.name+" and age :"+age);
		// father name is static variable so access with interface name
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.m(45);
		System.out.println("Son name :"+s.name);
		
		
	}
}
