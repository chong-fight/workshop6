/**
 * Workshop 6 - Exercise 4 (Easy)
 *
 * Decode a coded message using the key table from the worksheet.
 * Coded message: "G tgsl Qefe."
 *
 * Key table (coded letter -> decoded letter):
 *   a b c d e f g h i j k l m n o p q r s t u v w x y z
 *   c r g z a v i b s d o e q f h u j x k l w m y n p t
 *
 * The two arrays below are simply that table written as parallel arrays, so
 * the program works out the column that holds the coded letter and prints the
 * letter underneath it. Changing the message (or the table) is all that is
 * needed to decode something else.
 */
public class Ex04DecodeMessage {

    /** Row 1 of the key table - the letters found in a coded message. */
    static final char[] CODED = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    /** Row 2 of the key table - the letters they decode to. */
    static final char[] PLAIN = {
        'c', 'r', 'g', 'z', 'a', 'v', 'i', 'b', 's', 'd', 'o', 'e', 'q',
        'f', 'h', 'u', 'j', 'x', 'k', 'l', 'w', 'm', 'y', 'n', 'p', 't'
    };

    /**
     * Look one letter up in the key table.
     * Letters that are not in the table (spaces, full stops, ...) are
     * returned unchanged, and capital letters are kept capital.
     */
    public static char decodeLetter(char ch) {
        boolean wasUpperCase = Character.isUpperCase(ch);
        char lower = Character.toLowerCase(ch);

        for (int i = 0; i < CODED.length; i++) {
            if (CODED[i] == lower) {
                char decoded = PLAIN[i];
                return wasUpperCase ? Character.toUpperCase(decoded) : decoded;
            }
        }
        return ch; // not a letter -> keep it as it is
    }

    /** Decode a whole message one character at a time. */
    public static String decodeMessage(String coded) {
        char[] codedLetters = coded.toCharArray();
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < codedLetters.length; i++) {
            message.append(decodeLetter(codedLetters[i]));
        }
        return message.toString();
    }

    public static void main(String[] args) {
        String codedMessage = "G tgsl Qefe.";

        System.out.println("Coded message   : " + codedMessage);
        System.out.println("Decoded message : " + decodeMessage(codedMessage));
        System.out.println();

        // The program decodes any message with the same key table.
        String another = "G tkfl Qefe.";
        System.out.println("Coded message   : " + another);
        System.out.println("Decoded message : " + decodeMessage(another)
                           + "   (\"I love Java.\" encoded with the same key)");
    }
}
