package com;

public class Return {

	// without arguments  and with return 
	
  	int display()
	{
		return 20;
	}
	public static void main(String[] args) {
		
		Return r = new Return();
		int result = r.display();
		
		System.out.println(result);
		
		System.out.println("or");
		
		System.out.println(r.display());
		
	}  
	
	
	
	
}
