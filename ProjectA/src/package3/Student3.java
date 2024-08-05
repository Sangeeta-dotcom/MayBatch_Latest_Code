package package3;
//Assignment 1
public class Student3 {
int rollNo;
int age;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[] args) {
	Student3 abc=new Student3();
	abc.display1();
	abc.display2();
	abc.rollNo =23;
	abc.age =20;
	System.out.println("Roll No is "+ abc.rollNo);
	System.out.println("Age is "+ abc.age);
}
}
