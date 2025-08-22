import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        // Step 1: Trim and split by spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: Reverse words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" "); // Add space between words
        }

        // Output
        System.out.println("Reversed string: " + result.toString());
    }
}
