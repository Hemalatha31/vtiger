package Abstraction;

public class childClass extends AbstractClass {

	@Override
	void sum() {
		System.out.println("Sum of two numbers");
		
	}

	@Override
	void multiplication() {
		System.out.println("multiplication of two numbers");
		
	}
	
	public void calc()
	{
		System.out.println("Child class calc");
	}

}
