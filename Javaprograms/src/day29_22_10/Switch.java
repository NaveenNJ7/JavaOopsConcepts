package day29_22_10;

public class Switch {
	
	public static void main(String[] args) {
		
		int a = 2;
		
		switch(a = 1)
		{
		
		case 1 : 
			System.out.println("Choice 1");
			
			   int c =20;
			   int b =10;
			   if(c>b)
			   {
				   System.out.println(c+" > "+b);
			   }
			   else
			   {
				   System.out.println(c+" < "+b);
			   }
		              
			          break;
		case 2 : 
			System.out.println("choice 2");
			     break;
		case 3 :
			System.out.println("Choice 3");
			     break;
		default :
			System.out.println("Invalid");
		}
	}

}
