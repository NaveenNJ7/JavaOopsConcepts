package day28_21_10;

public class Order extends MainDish implements Snacks,Soup {

	@Override
	public void s(String soup) {
		
		System.out.println(bowl+" "+soup+" soup");
	}
	
	@Override
	public void snk(String Papad) {
		
		System.out.println(plates+" "+Papad);
	}
	
	public static void main(String[] args) {
		
		Order ord = new Order();
		
		System.out.println("Hotel name : "+name);
		System.out.println("Location : "+location);
		
		ord.s("Mashrum");
		
		ord.snk("Masala Papad");
		
		ord.md("Masala Rice", "Moong dhal","Oil chapati",1);
		
		
	}
	
}
