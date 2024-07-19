public class Main {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6}; // Define and initialize the array
        int evenCount = 0; // Initialize even count variable
        int oddCount = 0; // Initialize odd count variable

        // Loop through each element in the array
        for (int i = 0; i < A.length; i++) {
            // Check if the current element is even
            if (A[i] % 2 == 0) {
                System.out.println("Even: " + A[i]);
                evenCount++; // Increment even count
            } else { // If not even, it's odd
                System.out.println("Odd: " + A[i]);
                oddCount++; // Increment odd count
            }
        }

        // Print the counts
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
