package week3_Assignment;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // Declare the array
        int[] arr = {3, 2, 11, 4, 6, 7};
        
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);
        
        // Step 2: Print the second largest number 
        System.out.println("Second largest number: " + arr[arr.length - 2]);
        
    }
}

