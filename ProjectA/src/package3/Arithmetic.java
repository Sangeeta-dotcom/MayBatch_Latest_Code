package package3;

public class Arithmetic {
public int sum(int a, int b)//sum method
{
	int c;
	c=a+b;
	System.out.println("Result is "+ c);
	return c;   //returning the addition of two number
}
public int sub(int a1, int b1) //sub method
{
	int c1;
	c1=a1-b1;
	System.out.println("Result is "+ c1);
	return c1;  //returning the subtraction of two numbers
}
public int multi(int a2, int b2) //multi method
{
	int c2;
	c2=a2*b2;
	System.out.println("Result is "+c2);
	return c2; //returning the multiplication of two numbers
}
public void div(int a3, int b3) //division method
{
	int result;
	result=a3/b3;
	System.out.println("final result is " +result);
}
public static void main(String[] args) {
	Arithmetic at=new Arithmetic();   //object creation
	int sumresult=at.sum(10,2);       //calling sum method
	int sumresult1=at.sum(sumresult, 2);//calling sum method again
	int subresult=at.sub(sumresult1, 2);//calling subtraction method
	int multiresult=at.multi(subresult, 2);//calling multi method
	at.div(multiresult, 2);                //calling division method
} 
}













