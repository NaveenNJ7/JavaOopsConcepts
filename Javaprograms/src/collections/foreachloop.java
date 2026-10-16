package collections;

public class foreachloop {

	
	public static void main(String[] args) {
		
		int[] a = {10,30,40,50,20};
		
		// normal for loop
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----------");
		
		// for each loop
		
		for(int i: a)
		{
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		double[] d = {1.1,2.2,3.3,4.4,5.5};
		
		for(double dl: d)
		{
			System.out.println(dl);
		}
		
		System.out.println("-----------");
		
		String[] name = {"Naveen","Navin", "Nawin"};
		
		for(String n: name)
		{
			System.out.println(n);
		}
		
		
		
		
	}
}
