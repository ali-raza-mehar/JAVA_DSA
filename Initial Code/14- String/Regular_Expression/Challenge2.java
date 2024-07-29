package Regular_Expression;

public class Challenge2 {
    public static void main(String[] args) {
        // binary check
        int a = 100020;
        String binary = String.valueOf(a);
        System.out.println(binary.matches("[01]+"));

        // hexadecimal check
        String hex = "1234";
        System.out.println(hex.matches("[0-9]+[A-F]+"));

        // date format check
        String date = "03-14-2004";
        System.out.println(date.matches("[0-3][0-9][-|/][0-1][0-9][-|/][2][0][0-9][0-9]"));
    }
}
