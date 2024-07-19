package Day16;

interface shape
{
	int a=100;
	int b=200;
	
	void circle();                                   // method 1 is abstract method
	
	default void square()                             //method 2 is default method
	{
		System.out.println("This is square");
	}
	static void rectangle()                          //method 3 is static method
	{
		System.out.println("this is rectangle");
		
	}
	
interface banglor
{
	int x=10;
	int y=20;
	int z=50;
	
	void m();                   //// Abstract method

	default void m1()                                        // Default method
	{
		System.out.println("x value is 10");
		System.out.println("y value is 20");
		System.out.println(" x and y value is:"+x+y);
	}
	static void m2()                                         // static method
	{
		System.out.println("z value is 50");
		System.out.println("y value is 20");
		System.out.println("z and y value is:"+z+y);
	}
		
}
public class Interface implements banglor
{
	public void m()
	{
		System.out.println("value is :"+x+y);
	}
	void m1(int x, int y)
	{
		System.out.println("value is :"+x+y);
	}
	void m2(int z, int y)
	{
		System.out.println("value is :"+z+y);
	}
	public void m()
	{
		System.out.println("This is abstract method and value is:"+x+y);
	}
	void rectangle()
	{
		System.out.println("This is triangle");
	}
public static void main(String[] args) 
	{
	
	Interface ifc=new Interface();
	ifc.m();
	ifc.m1();
	ifc.m2(z, y);
	
	banglor br=new Interface();
	br.m();
	br.m1();
	banglor.m2();
	
	
	
	
	Interface ifobj =new Interface();
	
//	ifobj.circle();
//	ifobj.square();
//	shape.rectangle();
	
//	shape sh=new Interface();
//	sh.circle();
//	sh.square();
//	shape.rectangle();
	
	
	
	
	}

}
