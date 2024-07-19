package Day20;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args)
	{

		HashMap hm= new HashMap();
		
		hm.put(10, "Naveen");
		hm.put(11,"renu");
		hm.put(12, "pavan");
		hm.put(14, "kalyan");
		
		System.out.println(hm.size());
		
		hm.remove(10);
		
		System.out.println(hm);
		
		hm.put(10, "naveen");
		System.out.println(hm.size());
		System.out.println(hm.get(10));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
//		for (int K:hm.keySet())
//		{
//		 	
//		}
		
		
		Iterator it=hm.entrySet().iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			
			
				}
		
		
		hm.clear();
		
		System.out.println("Is it Empty?"+hm.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
