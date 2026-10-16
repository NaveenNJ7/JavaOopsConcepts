package day17_08_10;

public class Son extends SUPER {

	
	int age = 30;
	
	void m()
	{
		int age = 10;
		
		System.out.println(age);
		
		System.out.println(this.age);
		
		System.out.println(super.age); // super keyword
	}
	
}
