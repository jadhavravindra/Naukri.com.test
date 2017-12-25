package UpdateNaukri.Framework.Naukri.com.test;

class x
{
	public void a()
	{
		System.out.println("this is empty method");
	}
	public void b()
	{
		a();
		
		System.out.println("this is 2nd empty");
		try {
			int a=10/0;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
		}
		c();
		
	}
	public void c()
	{
	
		System.out.println("this 3rd empty");
	}
	}

public class Naukri1 {
	
	public static void main(String[] args) 
	{
	x x1=new x();
	x1.b();
	
	
}}
