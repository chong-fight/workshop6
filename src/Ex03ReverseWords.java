/**
 * Workshop 6 - Exercise 3 (Medium)
 *
 * Use loops and arrays to reverse the letters of every word in a sentence.
 * "To be or not to be."  ->  "oT eb ro ton ot eb."
 *
 * The sentence is split into an array of words, then each word is turned into
 * a char array which is walked backwards to build the reversed word.
 */
public class Ex03ReverseWords {

    /**
     * Reverse the letters of one word by reading its char array backwards.
     * Any punctuation at the end of the word stays where it is, so "be."
     * becomes "eb." and not ".eb".
     */
    public static String reverseWord(String word) {
        char[] letters = word.toCharArray();

        // Find where the letters stop at the end of the word.
        int lastLetter = letters.length - 1;
        while (lastLetter >= 0 && !Character.isLetter(letters[lastLetter])) {
            lastLetter--;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = lastLetter; i >= 0; i--) {
            reversed.append(letters[i]);
        }

        // Put the trailing punctuation back after the reversed letters.
        for (int i = lastLetter + 1; i < letters.length; i++) {
            reversed.append(letters[i]);
        }
        return reversed.toString();
    }

    /** Split the sentence into words and reverse every word. */
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(reverseWord(words[i]));

            // Put the single spaces back between the words.
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] sentences = {
            "To be or not to be.",
            "Java is fun",
            "The workshop six is about collections."
        };

        for (String sentence : sentences) {
            System.out.println("Before: " + sentence);
            System.out.println("After : " + reverseSentence(sentence));
            System.out.println();
        }
    }
}
