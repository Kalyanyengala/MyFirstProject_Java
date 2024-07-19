package Day20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class SetHash1 {

	public static void main(String[] args)
	{
		HashSet myset=new HashSet();

		System.out.println(myset);
		myset.add(100);
		myset.add("hello");
		myset.add(200);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		
		myset.remove("hello");
		System.out.println(myset);
		myset.add("hello");
		System.out.println(myset);
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		
		for (Object x:myset)
		{
			System.out.println(x);
		}
		
//		Iterator<Object>it= myset.iterator();
//		
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//			
//		}


		Iterator it= myset.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			
			
		}
		
		myset.clear();
		
		System.out.println("All Empty in this Set?"+myset.isEmpty());
		System.out.println(myset.size());
		
		
		

	}

}
