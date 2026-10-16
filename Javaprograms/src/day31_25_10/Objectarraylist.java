package day31_25_10;

public class Objectarraylist {

	String name;
	int rollnumber;
	
	Objectarraylist(String name, int rollnumber)
	{
		this.name = name;
		this.rollnumber = rollnumber;
	}
	
	@Override
	public String toString()
	{
		return "Name : "+name+" and "+"rollnumber : "+rollnumber;
	}
	
	public static void main(String[] args) {
		
		Objectarraylist obj1 = new Objectarraylist("Ram",01);
		Objectarraylist obj2 = new Objectarraylist("Krish",02);
		Objectarraylist obj3 = new Objectarraylist("Arjun",03);
		
		Objectarraylist[] obj = new Objectarraylist[3];
		obj[0] = obj1;
		obj[1] = obj2;
		obj[2] = obj3;
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		
	    System.out.println("------OR------");
	    
	    for(int i=0; i<obj.length; i++)
	    {
	    	System.out.println(obj[i]);
	    }
		
	}
}
