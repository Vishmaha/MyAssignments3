package week3_Assignment;

		import java.util.Arrays;

		public class MissingElement {
		    public static void main(String[] args) {
		        // Declare the array
		        int[] arr = {1, 2, 3, 4, 10, 6, 8};

		        // Step 1: Sort the array in ascending order
		        Arrays.sort(arr);

		        // Step 2: Check for missing numbers in the sequence
		        for (int i = 0; i < arr.length - 1; i++) {
		            // If the next element is not the current element + 1, we have a missing number
		            if (arr[i] + 1 != arr[i + 1]) {
		                // Print the missing number
		                System.out.println("Missing number: " + (arr[i] + 1));
		            }
		        }
		    }
		

	
}
