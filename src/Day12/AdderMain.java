package Day12;

public class AdderMain{

	public static void main(String[] args) 
	{
	
//		Adder ad=new Adder();
//		
//		ad.sum();
//		ad.sum(100,20.3);
//		ad.sum(10.0,1000);
//		ad.sum(1000,"pavan",25.0);
//
		
//		Adder ad=new Adder();
//		Adder ad1=new Adder(10.3,35.2,47.1);
//		Adder ad2=new Adder(119.0);
//		
//		System.out.println(ad.volume());
		
		// ENCAPSULATIONS
		
		Adder add=new Adder();
		
		add.setaccno(1000101);
		add.setamount(20000);
		add.setName("Pavan");
		
		System.out.println(add.getaccno);
		System.out.println(add.getamount);
		System.out.println(add.getname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
