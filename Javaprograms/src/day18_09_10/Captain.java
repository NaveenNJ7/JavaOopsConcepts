package day18_09_10;

public class Captain extends Coach {
	
	String player;
	
	String role;
	

	Captain(String name, String role){
		
		super("Gautam gambir");
		System.out.println("Indian team Captina name : "+name+" & role : "+role);
		
		System.out.println("Players name");
		
	}
	
	void players(String player, String role) {
		
		this.player = player;
		
		this.role = role;
		
		
		System.out.println(this.player+" & role : "+this.role);
	}
	
	
}
