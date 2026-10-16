package Hashcode;

public class Example {
	
	@Override
	public int hashCode()
	{
		return 57;
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		System.out.println(e.hashCode());
	}

}
