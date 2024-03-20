public class PrimeOptimized {
    static int isPrime(int n) {
        if (n <= 2)
            return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean check = true;
            if (i == 2) {
                count++;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }

            }
            if (check == true)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1500000));
    }
}
