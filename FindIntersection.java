package week3_Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    public static void main(String[] args) {
        // Declare the first array
        int[] array1 = {3, 2, 11, 4, 6, 7};
        // Declare the second array
        int[] array2 = {1, 2, 8, 4, 9, 7};

        // Convert the arrays to lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add elements of the first array to list1
        for (int i = 0; i < array1.length; i++) {
            list1.add(array1[i]);
        }

        // Add elements of the second array to list2
        for (int i = 0; i < array2.length; i++) {
            list2.add(array2[i]);
        }

        // Iterate through list1 and check if elements exist in list2 using a simple for loop
        System.out.println("Intersection of both arrays:");
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    System.out.println(list1.get(i));
                    break; // Break to avoid duplicate intersection values
                }
            }
        }
    }
}

