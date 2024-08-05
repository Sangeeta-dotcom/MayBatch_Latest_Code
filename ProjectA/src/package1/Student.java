package package1;

public class Student 
{
	int deepak;
	public void display()
	{
System.out.println("Well come to All");
}
	public static void main(String[] args) {
		
		Student abc=new Student();
		abc.display();
		//abc.display();
		abc.deepak=334;
		System.out.println("value of deepak" +abc.deepak);
	}
}
