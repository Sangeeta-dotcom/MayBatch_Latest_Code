package package1;
                          //(10+2)(10-2)=>(10+2) is non void method becoz we need result of this sum for next multiflication
public class Arithmetic {                 // (10-2)is also non void method becoz we need result of this substraction for next multiflication.
	
public int sum(int a, int b)
{
	int c=a+b;
	//c=a+b;
	System.out.println("sum resut is "+c);
	return c;
}
public int sub(int a1, int b1)
{
	int c1=a1-b1;
	//c1=a1-b1;
	System.out.println("sub result "+c1);
	return c1;
}
public void multi(int a2, int b2)//here we dont need result for next action so return is not there 
{
	int result;
	result=a2*b2;
	System.out.println("final result is "+result);
	}
public static void main(String[] args) {
	Arithmetic obj=new Arithmetic();
	int sumresult=obj.sum(10,2);//here we store obj.sum in int sumresult becoz we pass this value in multiflication
	int subresult=obj.sub(10, 2);
	obj.multi(sumresult,subresult);
}
}
                 