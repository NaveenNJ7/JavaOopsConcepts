package Libraries;

public class Student {

	
	String name;
	int id;
	
	// constructor
	Student(String name, int id)
	{
		this.name= name;
		this.id = id;			
	}
	
	// constructor with implementation
	Student(String name)
	{
		this.name = name;
		System.out.println("Name of student :"+this.name);
	}
	
	@Override
	public String toString()
	{
		return "id :"+this.id+" and Name :"+this.name; 
		// we can write variable directly id and name also instead of this
	}
	
	/* suppose if we not override toString(), directly print the object reference 
	we get fullyqualified address   */
	// if we want name and id to print without override means, use dot(.)operator 
	
	public static void main(String[] args) {
		
		Student s = new Student("Cool"); 
		// without printing, it will call constructor and execute the implementations
		
		System.out.println("--------");
		
		Student s1 = new Student("Su", 10);
		Student s2 = new Student("From", 11);
		Student s3 = new Student("Ambore", 12);
		
		System.out.println(s1); // overridden method
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("-------------");
		
   // without overriding toString(), if we print s1.name/s1.id we will get name which we passed
		
		System.out.println("name :"+s1.name+"\nid :"+s1.id);
		System.out.println("---------");
		System.out.println("name :"+s2.name+"\nid :"+s2.id);
		
	}
	
}
