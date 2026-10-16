package day31_25_10;

public class Simple {

	String name;
	int number;
	
	Simple(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public static void main(String[] args) {
		
		Simple s1 = new Simple("Rave",10);
		Simple s2 = new Simple("Shivu",20);
		
		Simple[] sim = new Simple[3];
		sim[0]=s1;
		sim[1]=s2;
		
		System.out.println(sim[0]);
		System.out.println(s1.name);
		System.out.println(s2.number);
		
		
		
	}
}
