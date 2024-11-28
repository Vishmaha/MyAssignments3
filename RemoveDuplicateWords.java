package week3_Assignment;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        // Input String
        String text = "We learn Java basics as part of java sessions in java week1";
        
        // Split the text into an array of words using space as the delimiter
        String[] words = text.split(" ");
        
        // Initialize a variable to keep track of duplicates
        int count = 0;
        
        // Iterate through the words array with two nested loops
        for (int i = 0; i < words.length; i++) {
            // Convert the current word to lowercase for case-insensitive comparison
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    // Replace duplicate word with an empty string
                    words[j] = "";
                    count++;
                }
            }
        }
        
        // Create an output string to store the final result without duplicates
        String result = "";
        
        // Loop through the words array and append non-empty words to the result string
        for (String word : words) {
            if (!word.equals("")) {
                result += word + " ";
            }
        }
        
        // Print the result without trailing space
        System.out.println(result.trim());
    }
}
