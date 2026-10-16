package day25_17_10;

public class Test {
 
	public static void main(String[] args) {
	
	Father f;
	f = new Daughter();
	
	System.out.println(f.name+" has two kids and he is working as "+f.work);
	
	if(f instanceof Son) {
		
		Son s = (Son) f;
		
		System.out.println(s.names+" father name is "+s.name+" and "+s.names+" age is "+s.ages+" and his father age is "+s.age);
	}
	
	else if(f instanceof Daughter ) {
		
		Daughter d = (Daughter) f;
		
		System.out.println(d.named+" father name is "+d.name+" and "+d.named+" age is "+d.aged+" and her father age is "+d.age);
	}
	
	}
}
