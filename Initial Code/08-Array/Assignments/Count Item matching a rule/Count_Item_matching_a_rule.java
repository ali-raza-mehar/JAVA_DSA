import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Count_Item_matching_a_rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "iphone"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rule key(type,color,name): ");
        ruleKey = in.next();
        System.out.print("Enter the rule value: ");
        String ruleValue = in.next();
        System.out.println(countMatches(items, ruleKey, ruleValue));
        in.close();
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;
        int count = 0;
        if (ruleKey.equals("type"))
            index = 0;
        if (ruleKey.equals("color"))
            index = 1;
        if (ruleKey.equals("name"))
            index = 2;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < 1; j++) {
                if (ruleValue.equals(items.get(i).get(index)))
                    count++;
            }
        }
        return count;
    }
}
