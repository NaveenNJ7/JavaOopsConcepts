package day31_25_10;

public class Student {

	String Sname = "ACO";
	
	public static void main(String[] args) {
		
		School s1 = new School("Akhil", 7);
		School s2 = new School("Ganpat",8);
		School s3 = new School("Patil",9);
		School s4 = new School("Gouda",10);
		
		Student st = new Student();
		System.out.println("School name : "+st.Sname);
		
		School[] s = {s1,s2,s3,s4};
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}
