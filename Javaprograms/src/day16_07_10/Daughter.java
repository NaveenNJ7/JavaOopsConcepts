package day16_07_10;

public class Daughter {

	
	String d = "Shwetha";
	
	int age2 = 5;
	
	public static void main(String[] args) {
		
		Son m1 = new Son();
		
		m1.m("Ramesh", 30);
		
		Daughter family = new Daughter();
		
		int age1 = 30;
		
		String s = "Ramesh";
		
		System.out.println(family.d+" Father name is "+s+" and his age is "+age1);
		
		System.out.println(family.d+" Grandfather name is "+m1.f+" and his age is "+m1.age+" her age is "+family.age2);
		
	}
}
