package package1;

public class ApiAutomation extends Automation
{
	public void dd()
	{
		System.out.println("Son2 method");
	}
	public static void main(String[] args) 
	{
		
		ApiAutomation a=new ApiAutomation();
		a.method1();
		a.dd();
	}

}
