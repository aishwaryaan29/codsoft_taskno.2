import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the wordCounter function and print the result
        int wordCount = wordCounter(inputSentence);
        System.out.println("Word count: " + wordCount);
    }

    // Function to count words in a sentence
    private static int wordCounter(String sentence) {
        // Split the sentence into words using the space character as a delimiter
        String[] words = sentence.split(" ");

        // Initialize a counter variable
        int count = 0;

        // Iterate through the array of words
        for (String word : words) {
            // Increment the counter for each non-empty word
            if (!word.isEmpty()) {
                count++;
            }
        }

        // Return the final count
        return count;
    }
}
