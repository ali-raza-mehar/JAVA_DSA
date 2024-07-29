
package Medium.Sentence_Similarity_III;

public class Sentence {
    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] word1 = sentence1.split("\\s");
        String[] word2 = sentence2.split("\\s");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length && j < word2.length) {
            if (word1[i].equals(word2[j])) {
                sb.append(word1[i] + " ");
                i++;
                j++;
            } else if (!word1[i].equals(word2[j]) && sentence1.contains(word2[j])) {
                sb.append(word1[i] + " ");
                i++;
            } else if (!word1[i].equals(word2[j]) && !sentence1.contains(word2[j])) {
                sb.append(word2[j] + " ");
                j++;
            } else {
                break;
            }
        }
        if (i != word1.length && j == word2.length)

        {
            for (; i < word1.length; i++) {
                sb.append(word1[i] + " ");
            }
        } else if (i == word1.length && j != word2.length) {
            for (; j < word1.length; j++) {
                sb.append(word2[j] + " ");
            }
        }

        return sb.toString().trim().equals(sentence1);
    }

    public static void main(String[] args) {
        // String sentence1 = "My name is Haley";
        // String sentence1 = "Eating right now";
        // String sentence2 = "Eating";
        String sentence1 = "of";
        StringBuilder sb = new StringBuilder(sentence1);
        // System.out.println(sb.indexOf(sentence1.charAt(0) + ""));
        // System.out.println(sb.indexOf("f"));
        // sentence1 = sentence1.replace("o", "");
        System.out.println(sentence1);
        String sentence2 = "A lot of words";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
}