package day10_01_10;

public class Addition {
	
	//method with arguments and without return
	
	/* void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum of a and b is "+sum);
	}

	public static void main(String[] args)
	{
		Addition A = new Addition();
		
		A.addition(0, 0);
		A.addition(10,20);
		A.addition(20,30);
		
	} */
	
	
	/* void logical(int a, int b)
	{
	   System.out.println(a>=b || a==b);
	   
	}
	
	public static void main(String[] args)
	{
		Addition log = new Addition();
		
		log.logical(10, 20);
		log.logical(10, 10);
		log.logical(20, 40);
		
	} */
	
	
	void test(int a, int b,int c)
	{
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
			{
				if(a>c)
				{
					System.out.println(a+" is greater than "+c);
				}
				else
				{
					System.out.println(a+" is less than "+c+" but greater than "+b);
				}
				
			}
		}
		
		else if(a<b)
		{
			System.out.println(a+" is less than "+b);
			{
				if(a>c)
				{
					System.out.println(a+" is greater than "+c);
				}
				else
				{
					System.out.println(a+" is less than "+b+" and less than "+c);
				}
			}
		}
		
		else if(a==b)
		{
			System.out.println(a+" is equal to "+b);
		
		if(a==c)
		  {
			System.out.println(a+" is equal to both "+b+" & "+c);
		  }
		else
		  {
			System.out.println(a+" is equal to "+b+" & not equal to "+c);
		  }
		}
	}
	
	public static void main(String[] args)
	{
		Addition comp = new Addition();
		
		comp.test(20,10,5);
		
		System.out.println("------------------");
		
		comp.test(10, 15, 5);
		
		System.out.println("------------------");
		
		comp.test(10, 10, 15);
		
		System.out.println("------------------");
		
		comp.test(10, 10, 10);
		
		System.out.println("------------------");
		
		comp.test(10, 5, 20);
		
		
		
		
	}
	
	
}


