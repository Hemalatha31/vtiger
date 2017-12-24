package ClassesObject;

public class calc {

	public static int x=10;
	public static int y=9;
	public static int z=0;
	
	public static void main(String[] args) {
		
		
		TestClassObject to=new TestClassObject();		
		to.num1=10;
		to.num2=5;
		to.substraction();
		to.addtion();
		int q=to.multiplication();
		System.out.println(q);
		int p=to.division(100, 10);
		System.out.println(p);
		TestClassObject.root();
		
		
		
		add();
		
	}
	
	public static void add()
	{
		z=x+y;
		System.out.println(z);
	}
	
	public void sub()
	{
		System.out.println("sub="+(x-y));
	}

}
