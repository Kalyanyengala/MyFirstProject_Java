package Day15;

class abc 
{
	void M1(int a)
	{
		System.out.println(a);
	}
}
class xyz extends abc
{
	void M1(int a)
	{
		System.out.println(a);
	}
	void M2(int a, int b)
	{
		System.out.println(a*b);
	}
}
  public class OverRide_class {

	public static void main(String[] args) 
	
	{
		xyz x=new xyz()
				{
			x.M1(100);
				}
			
		

	}

}
