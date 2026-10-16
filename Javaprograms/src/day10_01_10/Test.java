package day10_01_10;

 class Test {
	
	// method with return type and with arguments
	
	int Example(int n)
	{
		return n+n;
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		
		int m = t.Example(5);
		
		int m1 = t.Example(3);
		System.out.println(m);
		
		System.out.println(m1);
	}

}
