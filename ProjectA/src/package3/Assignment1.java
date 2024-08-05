package package3;
                      //((((10+2)*2)-2)*2)/2)

public class Assignment1 {
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("result is "+c);
	return c;
}
public int multi(int a1, int b1) 
{
	int c1;
	c1=a1*b1;
	System.out.println("result is "+c1);
	return c1;
}
public int sub(int a2, int b2)
{
	int c2;
	c2=a2-b2;
	System.out.println("result is "+c2);
	return c2;
}
public void div(int a3, int b3)
{
	int result ;
	result=a3/b3;
	System.out.println("final result is "+result);
	}
public static void main(String[] args) {
	Assignment1 as=new Assignment1();
	int sumResult=as.sum(10,2);
	int multiResult=as.multi(sumResult, 2);
	int subResult=as.sub(multiResult, 2);
	int multiResult1=as.multi(subResult,2);
	as.div(multiResult1, 2);
	
	
	
	
	
	
	
	
	
}
}






