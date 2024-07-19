package Day6;

public class Assignment_3 {

	public static void main(String[] args) 
	
	{

		
//
        int A[]= {1, 2, 3, 4, 5, 6, 8,10,11,17,21,23,44,32,27};
        int evencount = 0;
        int oddcount = 0;
        for (int i=0; i< A.length; i++) {
        	if (A[i]%2==1) {
        		
//        	System.out.println("even:" + A[i]);
        		oddcount++;
        	} else {
//        		System.out.println("odd:" + A[i]);
        		evencount++;
        	}
        	
        }
    	System.out.println("Even count: " + evencount);
        System.out.println("Odd count: " + oddcount);

	}

}
