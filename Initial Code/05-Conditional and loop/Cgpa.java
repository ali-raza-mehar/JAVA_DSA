import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        int sem;
        String alphabet;
        alphabet = "b";
        float CGPA, GPA, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you current semester: ");
        sem = in.nextInt();
        for (int i = 1; i < sem; i++) {
            if(i == 1)
                alphabet = "st";
            else if (i == 2)
                alphabet = "nd";
            else if (i == 3)
                alphabet = "rd";
            else if (i >= 4)
                alphabet = "th";
            System.out.print("Enter your " + i + alphabet + " semester GPA: ");
            GPA = in.nextFloat();
            sum = sum + GPA;
        }
        CGPA = sum / (sem - 1);
        System.out.print("CGPA = "+CGPA);
    }
}
