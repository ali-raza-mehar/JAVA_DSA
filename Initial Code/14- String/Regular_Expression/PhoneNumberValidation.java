package Regular_Expression;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String phoneNumber = "03084072434";
        boolean isValid = phoneNumber.matches("[+ | 9 | 2|0-9]{11,14}");
        // System.out.println(isValid);

        String email = "test...e.mail+alex@leetcode.com";
        int plusIndex = email.indexOf("+");
        int atTheRateIndex = email.indexOf("@");
        email = email.replace(email.substring(plusIndex, atTheRateIndex), "");
        // System.out.println(email);
        atTheRateIndex = email.indexOf("@");
        String localName = email.substring(0, atTheRateIndex);
        // System.out.println(localName);
        localName = localName.replaceAll("\\.+", "");
        // System.out.println(localName);
        String domainName = email.substring(atTheRateIndex);
        // System.out.println(domainName);
        String uniqueEmail = localName + domainName;
        // System.out.println(uniqueEmail);

    }
}
