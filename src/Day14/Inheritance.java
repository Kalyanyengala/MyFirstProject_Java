package Day14;


class A
{
	int a=100;
    String s="PAVAN";
    double d=10.2;
    char c='a';
    
	void display()
	{
		System.out.println();
	}
	
}
class B extends A
{
	int b=200;
	String s="renu";
	double d= 12.2;
	char z='X';
	
	
	void show() 
	{
     System.out.println(b);
	
	}
	
}
class C extends B
{
	int C=300;
	String s="Kalyan";
	double d=90.3;
	char f='w';
			
	void print() {
		System.out.println(C);
	}
}




public class Inheritance 
{ 

	public static void main(String[] args) 
	
	{
		A aoo =new A();
		
		System.out.println(aoo.a);
		System.out.println(aoo.s);
		System.out.println(aoo.d);
		System.out.println(aoo.c);
		
		aoo.display();
		
		B boo=new B();
		
		System.out.println(boo.a);
		System.out.println(boo.s);
		System.out.println(boo.d);
		System.out.println(boo.c);
		
		boo.show();
		
		C coo=new C();
		
		System.out.println(coo.a);
		System.out.println(coo.s);
		System.out.println(coo.d);
		System.out.println(coo.c);
		
		coo.print();
		coo.display();
		coo.show();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
