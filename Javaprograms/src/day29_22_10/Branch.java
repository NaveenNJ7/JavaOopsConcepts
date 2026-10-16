package day29_22_10;

public class Branch implements Bank {
	
	int balance = 10000;
	
	@Override
	public void deposit(int amount) {
		
		System.out.println("Amount deposited "+amount);
		
		balance = balance+amount;
			
	}
	
	public void withdraw(int amount) {
		
		System.out.println("Amount withdraw "+amount);
		
		balance = balance - amount;
	}
	
	public void checkbalance() {
		
		System.out.println("Check balance "+balance);
	}

}
