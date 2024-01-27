// problem ye hai k hmain ye find krna k array mai jitny bhi numbers hain.
// hr number k jitny b digit hain un ko count krna hai.
// phir us count ko 2 pai divide krna agr 2 pai divide ho gya to ek number ho gya jis k digits k count even hai
public class Even_Number_of_digit {
    public static void main(String[] args) {
        int[] array = { 1, 1, 482, 1771 };
        System.out.println(FindNumbers(array));
    }

    static int FindNumbers(int[] nums) {
        int evenDigit = 0;
        String num;
        for (int i = 0; i < nums.length; i++) {
            num = String.valueOf(nums[i]);
            if (num.length() % 2 == 0)
                evenDigit++;
        }
        return evenDigit;
    }
}