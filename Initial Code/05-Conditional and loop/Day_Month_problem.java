public class Day_Month_problem {
    public static void main(String[] args) {
        int day, count;
        count = 0;
        for(day = 1; day <= 31; day++){
            if (day % 2 == 0)
                count++;
        }
        System.out.print("The number of days is " + count + " he can go to his friend house");
    }
}
