package prasanna42;
import java.util.*;
class add
{
public void addition(int a,int b)
{
int c;
c=a+b;
System.out.println("Sum is"+c);
}
}
class sub
{
public void subtraction(int a,int b)
{
int c;
c=a-b;
System.out.println("sub is:"+c);
}
}
class mul
{
public void multiplication(int a,int b)
{
int c;
c=a*b;
System.out.println("Mul is:"+c);
}
}
class div
{
public void division(int a,int b)
{
int c;
c=a/b;
System.out.println("div is:"+c);
}
}

public class calculator {
	public static void main(String[] args)
	{
	String s;
	int a,b;
	System.out.println("enter add or sub or mul or div");
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	if(s.contentEquals("add"))
	{
	a=sc.nextInt();
	b=sc.nextInt();
	add a1=new add();
	a1.addition(a,b);
	}
	else if(s.contentEquals("sub"))
	{
	a=sc.nextInt();
	b=sc.nextInt();
	sub s1=new sub();
	s1.subtraction(a,b);

	}
	else if(s.contentEquals("mul"))
	{
	a=sc.nextInt();
	b=sc.nextInt();
	mul m=new mul();
	m.multiplication(a, b);
	}
	else if(s.contentEquals("div"))
	{
	a=sc.nextInt();
	b=sc.nextInt();
	div d=new div();
	d.division(a, b);
	}
	else
	{
	System.out.println("cannot perform operation");
	}


	}

}
