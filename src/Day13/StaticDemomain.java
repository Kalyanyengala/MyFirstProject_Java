package Day13;

public class StaticDemomain 
{
	
	static int a=100;
	int b=200;
	
	static void m1()
	{
		System.out.println("This is static");
	}
	void m2()
	{
		System.out.println("this is not a static");
	}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		m1();
		StaticDemomain st=new StaticDemomain();
		
	System.out.println(st.b);
	st.m();
	
		
	}
	
	

}
