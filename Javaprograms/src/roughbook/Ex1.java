package roughbook;

public class Ex1 {

	public static void main(String[] args) {
		
		int n=12345;
		
		while(n!=0)
		{
			int num=n%10;
			System.out.println(num);
			n=n/10;
		}
		
	}
}
