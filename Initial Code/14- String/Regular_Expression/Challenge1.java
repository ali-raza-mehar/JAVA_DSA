package Regular_Expression;

public class Challenge1 {
    public static void main(String[] args) {
        String s = "programmer@gmail.com";
        int i = s.indexOf("@");
        String userName = s.substring(0, i);
        String domainName = s.substring(i + 1);
        System.out.println("User Name: " + userName);
        System.out.println("Domain Name: " + domainName);
        System.out.println(s.matches("(.*)(gmail)(.*)"));
    }
}
