package Regular_Expression;

public class Challenge3 {
    public static void main(String[] args) {
        // remove special characters
        String str = "a@%%%b%c!1*2$3";
        str = str.replaceAll("\\W", "");
        System.out.println(str);

        // remove spaces
        String str2 = "a b c 1 2 3 ";
        str2 = str2.replaceAll("\\s+", "");
        System.out.println(str2);

        // count words
        String word = "   a   b c d e f    g h i j k  ";
        word = word.trim();
        word = word.replaceAll("\\s+", "");
        System.out.println(word.length());
    }
}
