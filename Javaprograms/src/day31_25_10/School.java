package day31_25_10;

public class School {

	
	String name;
	int std;
	
	School(String name, int std) {
		
		this.name = name;
		this.std = std;
	}
	
	@Override
	public String toString() {
		
		return "Student name : "+name+"\nHe is studying in "+std+"th class";
	}
	
	
}
