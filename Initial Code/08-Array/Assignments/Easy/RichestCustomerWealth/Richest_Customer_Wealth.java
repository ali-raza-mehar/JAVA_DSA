
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 },
        };
        int[] SumOfMoney = new int[accounts.length];
        int sum;
        for (int account = 0; account < accounts.length; account++) {
            sum = 0;
            for (int money = 0; money < accounts[account].length; money++) {
                sum = sum + accounts[account][money];
            }
            SumOfMoney[account] = sum;
        }
        int max = SumOfMoney[0];
        int customer = 1;
        for (int i = 1; i < SumOfMoney.length; i++) {
            if (SumOfMoney[i] > max) {
                max = SumOfMoney[i];
                customer++;
            }
        }
        System.out.println("The customer " + customer + " has the richest wealth " + max);
    }
}