package Notes;

import java.util.ArrayList;
import java.util.Scanner;

public class MulDImArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // how many list I want to created inside the list
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        in.close();
    }
}
