package day25_17_10;

public class Test1 {

	
	public static void main(String[] args) {
		
		Compnay c = new Developer();
		
		System.out.println("Company name : "+c.name);
		
		if(c instanceof Developer) {
			
			Developer d = (Developer) c;
			
			System.out.println("Employee name : "+d.ename);
			System.out.println("Id : "+d.id);
		}
		
		else if(c instanceof Tester) {
			
			Tester t = (Tester) c;
			System.out.println("Employee name : "+t.ename1);
			System.out.println("Id : "+t.id1);
			
			
		}
	}
}
