package day9_30_09;

public class Solution {

	
	public static void main(String[] args)
	{
		
		Employee1 E1 = new Employee1();
		
		Employee1 E2 = new Employee1();
		
		Employee1 E3 = new Employee1();
		
		E1.id = 101;
		E1.name = "Ramesh";
		E1.salary = 5000;
		
		E2.id = 102;
		E2.name = "Suresh";
		E2.salary = 10000;
		
		E3.id = 103;
		E3.name = "Mahesh";
		E3.salary = 15000;
		
		System.out.println(E1.name+" id number is "+E1.id+" and he is getting salary "+E1.salary);
		
		System.out.println(E2.name+" id number is "+E2.id+" he is getting salary "+E2.salary);
		
		System.out.println(E3.name+" id number is "+E3.id+" he is getting salary "+E3.salary);
		
		
		
		
		
	}
}
