public class Loops {
    public static void main(String[] args) {
        /*
         when to use for loop and while loop?
         1) When you do not know how much time the loop will run.
         in this condition you will use the while loop.
         2) When you already know how much time the loop will run.
         in this condition you will use the for loop.
        */
        int exp = 2;
        long sum = 0;
        for (int i = 1; i <= 20 ; i++) {
            sum = (long) (sum + Math.pow(i , exp));
            System.out.print(Math.pow(i , exp) + " + ");
            exp += 1;
        }
        System.out.println("The sum is = " + sum);
    }
}
