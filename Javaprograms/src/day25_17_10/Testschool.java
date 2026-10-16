package day25_17_10;

public class Testschool {

	public static void main(String[] args) {
		
	/*	Boy b = new Boy();
		Girl g = new Girl();
		School s = new School();
		
		System.out.println(b instanceof Boy); // true
		System.out.println(g instanceof Girl); // true
		System.out.println(s instanceof School);// true
		
		System.out.println(b instanceof School); // true
		System.out.println(s instanceof Boy); // false
		System.out.println(s instanceof Girl); // false */
		
		School s = new Girl();
		
		if(s instanceof Boy)
		{
			System.out.println("Downcasting to boyclass");
			
			Boy b = (Boy) s;
			
			System.out.println("Boy name is : "+b.nameb+" School name : "+b.name);
		}
		
		else if(s instanceof Girl)
		{
			System.out.println("Downcasting to girlclass");
			
			Girl g = (Girl) s;
			
			System.out.println("Girl name is : "+g.nameg+(" School name is : "+g.name));
		}
	}
}
