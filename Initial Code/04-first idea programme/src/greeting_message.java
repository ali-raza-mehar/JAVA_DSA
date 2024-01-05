import  java.util.Random;
import  java.util.Scanner;
public  class greeting_message {
    public static void main(String[] args) {
        int randomNumber;
        String name;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        randomNumber = random.nextInt(6);
        System.out.print("Enter any name: ");
        name = input.nextLine();
        switch (randomNumber){
            case 0:
                System.out.println("Good morning "+ name + "! Wishing you a day filled with" +
                        " positivity and productivity.");
                break;
            case 1:
                System.out.println("Hello "+ name + "! May your day be as bright and cheerful as your smile.");
                break;
            case 2:
                System.out.println("Welcome " + name + "! I hope your day is off to a fantastic" +
                        " start and only gets better from here.");
                break;
            case 3:
                System.out.println("Hi " + name + "! Sending you good vibes for a wonderful day ahead.");
                break;
            case 4:
                System.out.println("Good afternoon " + name + "! Take a moment to appreciate the small joys around you and make the most of this day.");
                break;
            case 5:
                System.out.println("Hey " + name + "! Whether your day is just beginning or winding down, I hope it's filled with moments that make you smile.");
                break;
            default:
                System.out.println(name);

        }

    }
}