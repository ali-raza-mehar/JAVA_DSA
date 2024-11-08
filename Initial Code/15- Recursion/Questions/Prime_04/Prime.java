package Questions.Prime_04;

public class Prime {
    static boolean checkPrime(int n) {
        return helper(n, (int) Math.sqrt(n), 2);
    }

    static boolean helper(int n, int ep, int i) {
        if (i > ep) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return helper(n, ep, i + 1);
    }

    public static void main(String[] args) {
        int n = 12;
        if (checkPrime(n)) {
            System.out.println("Number [" + n + "] is prime!!");
        } else {
            System.out.println("Number [" + n + "] is not prime!!");
        }
    }
}
