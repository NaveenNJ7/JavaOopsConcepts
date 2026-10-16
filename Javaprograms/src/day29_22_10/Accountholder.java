package day29_22_10;

public class Accountholder {

	
	public static void main(String[] args) {
		
		Branch br = new Branch();
		
		System.out.println("Available balance "+br.balance);
		
		Bank user = new Branch();
		
		user.deposit(50000);
		
		user.checkbalance();
		
		System.out.println("---------------");
		
		user.withdraw(5000);
		
	    user.checkbalance();
	    
	    
		
		
	}
	
}
