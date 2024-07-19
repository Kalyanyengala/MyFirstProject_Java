package Day16;

interface i1
{
	int x=100;
	void m();
	
public interface i2
{
	int y=200;
	void m1();
}
 firstclass c1 implements i1,i2
{
	public void m()
	{
		System.out.println(x);
	}
	public void m1()
	{
		System.out.println(y);
	}
	
	
}

public class Interface1
{

	public static void main(String[] args) {
		
		firstclass fc=new firstclass();
		fc.m();
		fc.m1();

	}

}}
