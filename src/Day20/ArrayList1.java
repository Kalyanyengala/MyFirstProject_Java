package Day20;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args)
	{
      ArrayList mylist=new ArrayList();
           
      
      System.out.println(mylist);
      System.out.println(mylist.size());
      mylist.add(100);
      mylist.add("hello");
      mylist.add(10.10);
      mylist.add(null);
      mylist.add(null);
      
//      System.out.println("length of the array is:"+mylist.size());
//      
//      System.out.println("Printingdata:"+mylist);
//      
//		
//      //mylist.remove(5);
//
//      System.out.println(mylist.size());
//      
//      mylist.add(2,"Hello world");
//      System.out.println(mylist);
//      
//      mylist.set(2, "welcome");
//      System.out.println(mylist);
//      mylist.get(1);
//      System.out.println(mylist);
//      
//      for (int i=0;i<mylist.size();i++)
//      {
//    	System.out.println(mylist.get(i));  
//      }
//	
//      for (Object x:mylist)
//      {
//    	  System.out.println(x);
//      }
//      
//      Iterator it= mylist.iterator();
//      
//      while(it.hasNext())
//      {
//    	  System.out.println(it.next());
//      }
      
      ArrayList mylist2= new ArrayList();
      
      mylist2.add(0);
      mylist2.add(1);
      mylist2.add(2);
      
      mylist.removeAll(mylist2);
      
      System.out.println(mylist);
      
      mylist.clear();
      System.out.println("Is array list empty?"+mylist.isEmpty());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
