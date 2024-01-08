import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        float discount;
        int price , discountedPrice;
        Scanner in = new Scanner(System.in);
        discount = in.nextFloat();
        price = in.nextInt();
        discount = discount / 100 * price;
        discountedPrice = price - (int) discount;
        System.out.print(discountedPrice);
    }
}
