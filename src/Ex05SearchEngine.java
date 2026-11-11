/**
 * Workshop 6 - Exercise 5 (Medium)
 *
 * A simple "search engine". Ten paragraphs are stored in an array of Strings
 * and a search phrase is looked up with String.contains().
 * If the phrase is found, the array index and the paragraph are printed.
 * If it is not found, a message saying so is printed.
 */
public class Ex05SearchEngine {

    public static void main(String[] args) {

        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        String phrase = "keyword search";

        System.out.println("Searching for the phrase: \"" + phrase + "\"");
        System.out.println("Found " + search(paragraphs, phrase) + " match(es).");
        System.out.println();

        // A phrase that is not in the book, to show the "not found" message.
        search(paragraphs, "quantum physics");
    }

    /**
     * Search every paragraph for the phrase.
     * Returns how many paragraphs contained the phrase.
     */
    public static int search(String[] paragraphs, String phrase) {
        int foundCount = 0;

        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(phrase)) {
                System.out.println("MATCH - paragraphs[" + i + "]: \"" + paragraphs[i] + "\"");
                foundCount++;
            }
        }

        if (foundCount == 0) {
            System.out.println("Sorry, the phrase \"" + phrase + "\" was not found in any paragraph.");
        }
        return foundCount;
    }
}
