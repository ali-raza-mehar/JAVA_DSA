// when return statment will execute control give answer to the call

package String_Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Notes.Notes_Code.Array_02.Arraylist;

public class SubSeSeq {
    static ArrayList<String> seq = new ArrayList<>();

    static void subseq(String res, String s) {
        if (s.isEmpty()) {
            System.out.println(res);
            return;
        }
        char ch = s.charAt(0);
        // take it or ignore it
        subseq(res + ch, s.substring(1));
        subseq(res, s.substring(1));
    }

    // add to the list
    static void subseq2(String s, String res) {
        if (s.isEmpty()) {
            seq.add(res);
            return;
        }
        char ch = s.charAt(0);
        // take it or ignore it
        subseq2(s.substring(1), res + ch);
        subseq2(s.substring(1), res);
    }

    // returning the list
    static ArrayList<String> subseq3(String s, String res) {
        ArrayList<String> list = new ArrayList<>();
        if (s.isEmpty()) {
            list.add(res);
            return list;
        }

        char ch = s.charAt(0);
        // take it or ignore it
        ArrayList<String> ansFromLeftCalls = subseq3(s.substring(1), res + ch);
        ArrayList<String> ansFromRightCalls = subseq3(s.substring(1), res);
        list.addAll(ansFromLeftCalls);
        list.addAll(ansFromRightCalls);
        return list;
        // return seq;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subseq3("", s));
    }
}
