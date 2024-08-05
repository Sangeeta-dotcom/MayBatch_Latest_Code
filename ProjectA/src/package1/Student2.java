package package1;

public class Student2    //from this program my 27th batch class started
{
int a;   //a is a variable that will store integer value
public void display() //display is the method
{ //boundary of the method
	System.out.println("welcome to all of you");
}
public static void main(String[] args){
	
	Student2 sang=new Student2(); //object creation
	sang.display(); //calling the display method
	System.out.println("i m the main method"); //printing a msg
	sang.display();  //calling the display method
	sang.a=14;       //calling the variable and giving the value  
	System.out.println("Value of a" +sang.a); //print the value of a
	sang.a=34;       //calling the variable and giving the value 
	System.out.println("Value of a" +sang.a); //printing the value
}
}
