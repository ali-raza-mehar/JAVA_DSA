import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = in.nextLine();
        if (pangram(sentence))
            System.out.println("Pangram");
        else
            System.out.println("Not pangram");
        in.close();
    }

    static boolean pangram(String sentence) {
        sentence = sentence.toLowerCase(); // Convert to lowercase for case-insensitivity
        sentence = sentence.trim();
        String result = "" + sentence.charAt(0);
        for (int i = 1; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            String currentString = "" + currentChar;
            if (!result.contains(currentString))
                result = result + currentChar;
        }
        result = result.trim();
        return result.length() == 26;
    }
}
