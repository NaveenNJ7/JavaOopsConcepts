package day26_18_10;

public class Order {

	
	void orderitem(Product prd) {
		
		prd.p();
	}
	
	public static void main(String[] args) {
		
		Order or = new Order();
		or.orderitem(new Product());
		or.orderitem(new Cloth());
		or.orderitem(new Shoes());
		
	
	}
}
