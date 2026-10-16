package Whatsapp;

public class Versionthree extends Versiontwo {

	@Override
	void v1()
	{
		super.v1();
		System.out.println("Voice call supports");
	}
	
	void v2()
	{
		this.v1();
		System.out.println("Video call supports");
	}
	
	void v3()
	{
		this.v2();
		System.out.println("We can upload image");
	}
	
	
}
