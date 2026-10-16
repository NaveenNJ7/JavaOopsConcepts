package day16_07_10;

public class ACO extends RCU {

	void college(String sname, int id, String cname)
	{
		System.out.println("Student name : "+sname);
		
		System.out.println("id : "+id);
		
		System.out.println("College name : "+cname);
	}
	
	public static void main(String[] args) {
		
		ACO coll = new ACO();
		
		coll.college("Apppuchinnu", 111, "ACO");
		
		System.out.println("University name : "+coll.uname);
	}
}
