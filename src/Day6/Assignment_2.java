//package Day6;
//
//public class Assignment_2 {
//
//	public static void main(String[] args)
//	
//	{
//		
//
//	}
//
//}
package Day6;

public class Assignment_2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}; // Define and initialize the array
        int sum = 0; // Initialize sum variable

        // Loop through each element in the array and add it to sum
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        // Print the sum
        System.out.print("Sum = " + sum);
    }
}

