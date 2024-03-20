
public class Binomial_Coffecient {

    static int binCoff(int n, int r) {
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int rMinusNFact = factorial(n - r);
        int binomialCoffecient = nFactorial / (rFactorial * rMinusNFact);
        return binomialCoffecient;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * n;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(binCoff(5, 4));
    }
}