package week3_Assignment;

public class ReverseOddWords {
    public static void main(String[] args) {
        // Input string
        String test = "I am a software tester";
        
        // Split the string into words using space as delimiter
        String[] words = test.split(" ");
        
        // String to store the final result
        String result = "";
        
        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // For odd positions (1, 3, 5,...), reverse the word
            if (i % 2 != 0) {
                String reversed = new StringBuilder(words[i]).reverse().toString();
                result += reversed + " ";
            } else {
                // For even positions (0, 2, 4,...), add the word as it is
                result += words[i] + " ";
            }
        }
        
        // Print the result, trim to remove the trailing space
        System.out.println(result.trim());
    }
}


