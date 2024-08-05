package package1;

public class Student1 
{
int age;
int rollNo;
public void Display1()
{
	System.out.println("Wellcome to you all");
}
public void Display2()
{
	System.out.println("Automation is easy");
}
public static void main(String[] args) 
{
	Student1 abc=new Student1();
	abc.Display1();
	abc.Display2();
	abc.age = 29;
	abc.rollNo = 2;
	System.out.println("value of age" +abc.age);
	System.out.println("Value of rollNo" +abc.rollNo);
	
}
}
