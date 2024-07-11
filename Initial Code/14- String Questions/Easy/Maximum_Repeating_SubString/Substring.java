package Easy.Maximum_Repeating_SubString;

public class Substring {
    static int maxRepeating(String sequence, String word) {
        if (word.length() > sequence.length())
            return 0;
        if (!sequence.contains(word))
            return 0;

        if (sequence.length() < 2 && word.length() < 2) {
            if (sequence.contains(word))
                return 1;
            else
                return 0;
        }

        int wordPointer = 0;
        int count = 0;
        for (int i = 0; i < sequence.length();) {
            if (sequence.charAt(i) == word.charAt(wordPointer)) {
                // now run loop till the length of word
                // to check exist or not
                // increment both i and wordPointer to check other characters of word exist in
                // substring or not
                i++;
                boolean existance = false;
                wordPointer += 1;
                // if i increment the length of sequence it means do not need to check substring
                if (i >= sequence.length()) {
                    break;
                }
                while (wordPointer < word.length()) {
                    // it means substring not exist
                    if (sequence.charAt(i) != word.charAt(wordPointer)) {
                        i++;
                        existance = false;
                        break;
                    } else {
                        i++;
                        wordPointer++;
                        existance = true;
                    }
                }
                if (existance) {
                    count++;
                }
                wordPointer = 0;
            } else {
                i++;
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
    }
}
