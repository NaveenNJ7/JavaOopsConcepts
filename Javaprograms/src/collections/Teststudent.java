package collections;

import java.util.ArrayList;
public class Teststudent {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Pavan", 01);
		Student s2 = new Student("Kiran", 02);
		Student s3 = new Student("Kamlesh", 03);
		
		System.out.println(s1.name);
		
		System.out.println("-------------");
		
		ArrayList<Student> l = new ArrayList();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		System.out.println("Objects present in l : "+l); 
		
		/* we get return as fullyqualified class. */
		
		for(Student s: l) // we can also write datatype of traverse as Object (supermost class)
		{
			System.out.println("Name : "+s.name);
			System.out.println("Name : "+s.name+" and RoleNumber"+s.RN);
		}
		
		
		
		
	}

}
