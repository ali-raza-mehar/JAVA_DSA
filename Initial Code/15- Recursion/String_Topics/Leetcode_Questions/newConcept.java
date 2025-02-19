package String_Topics.Leetcode_Questions;

public class newConcept {

    public static void main(String[] args) {
        System.out.println(func(5, 0));
    }

    static int func(int nums, int i) {
        if (nums == 0) {
            return i;
        }

        // i = i + 1;
        return func(nums - 1, i + 1);
    }

}
