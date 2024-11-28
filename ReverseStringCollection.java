package week3_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseStringCollection {
    public static void main(String[] args) {
        // Declare a String array with the specified values
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Add the array elements to a list
        List<String> companyList = new ArrayList<>();
        for (String company : companies) {
            companyList.add(company);
        }

        // Reverse the list
        Collections.reverse(companyList);

        // Iterate through the list and print the elements
        for (String company : companyList) {
            System.out.print(company + ", ");
        }
    }
}


