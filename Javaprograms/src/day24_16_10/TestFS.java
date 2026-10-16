package day24_16_10;

public class TestFS {
	
	
	public static void main(String[] args) {
		
	
			Father f = new Son();
	
			System.out.println("Upcasting");
			
			System.out.println("Father name is : "+f.name+" and his age is : "+f.age);
			
			System.out.println("---------------");
			
			System.out.println("Downcasting");
			
			Son s = (Son) f;
			
			System.out.println(s.name+" has son his name is "+s.name1+" and his son age is "+s.age1);
			
			
	
	
	}
}
