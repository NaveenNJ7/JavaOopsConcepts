package Insta;

public class Version2 extends Version1 {

	@Override
	void v1()
	{
		super.v1();
		System.out.println("Support GIF");
	}
	
	void v2()
	{
		this.v1();
		System.out.println("Can send text message");
	}
}
