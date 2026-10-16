package day14_05_10;

public class Blocks1 {
	
	static
	{
		System.out.println("Block1");
	}

	public static void main(String[] args) {
		
		 
		
		System.out.println("Always class loader execute first static variables before main method");
		
        System.out.println("They execute in sequential");
        
        System.out.println("First block1,block2,block2 will execute");
        
        
	}
	
	static
	{
		System.out.println("Block2");
	}
	
	static
	{
		System.out.println("Block3");
	}
	
	static int id;
	static
	{
		 id = 351;
	}
	
	static
	{
		 id = 352;
		 
		 System.out.println(id);
	}
}
