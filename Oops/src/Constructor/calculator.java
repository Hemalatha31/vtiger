package Constructor;

public class calculator extends LearnConstructor {
	
	public int num1;
	public int num2;
	public int result;
	
	public calculator(int num1,int num2)
	{
		super(num1,num2);		
		this.num1=num1;
		this.num2=num2;		
		System.out.println("Constructor of calculator class");
	}
	
	public void sum()
	{
		result=num1+num2;
		System.out.println("sum="+result);
	}
	
	public void sub()
	{
		result=num1-num2;
		System.out.println("sub="+result);
	}
	
	public void multi()
	{
		result=num1*num2;
		System.out.println("Multi="+result);
	}

}
