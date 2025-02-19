package String_Topics.Leetcode_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Notes.Notes_Code.Recursion_Basics_01.reverseString;

public class Phone_Keyboard {
    public static void main(String[] args) {
        System.out.println((subSet("abc", "")));
    }

    static ArrayList<String> subSet(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // take the character
        p = p + up.charAt(0);
        ArrayList<String> leftCallAns = subSet(up.substring(1), p);

        // not take the character
        ArrayList<String> rightCallAns = subSet(up.substring(1), p);

        // add the answer of both calls
        leftCallAns.addAll(rightCallAns);

        // return it
        return leftCallAns;

    }
}
