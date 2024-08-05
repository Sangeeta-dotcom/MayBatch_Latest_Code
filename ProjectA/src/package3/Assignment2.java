package package3;
//((((10/2)-2)*2)-2)+2)
public class Assignment2 {
public int div(int a,int b)
{
	int c;
	c=a/b;
	System.out.println("result is "+c);
	return c;
}
public int sub(int a1, int b1)
{
	int c1;
	c1=a1-b1;
	System.out.println("result is "+c1);
	return c1;
}
public int multi(int a2, int b2)
{
	int c2;
	c2=a2*b2;
	System.out.println("result is "+c2);
	return c2;
}
public void sum(int a3,int b3)
{
	int c3;
	c3=a3+b3;
	System.out.println("result is "+c3);
}
public static void main(String[] args) {
	Assignment2 as=new Assignment2();
	int divResult=as.div(10, 2);
	int subResult=as.sub(divResult, 2);
	int MultiResult=as.multi(subResult,2);
	int subResult1=as.sub(MultiResult, 2);
	as.sum(subResult1, 2);
}
}
