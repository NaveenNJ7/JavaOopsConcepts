package Company;

public class Developer extends Employee {

	
	@Override
	void work()
	{
		super.work();
		System.out.println("Developer writing codes");
	}
}
