/**
 * Workshop 6 - Exercise 1 (Easy)
 *
 * Store the names of 10 favourite songs in an array of Strings and the
 * matching artist names in a second array of Strings, then print the list.
 * The two arrays are "parallel arrays": the artist at index i belongs to
 * the song at index i.
 */
public class Ex01FavoriteSongs {

    public static void main(String[] args) {

        String[] songs = {
            "Bohemian Rhapsody",
            "Rolling in the Deep",
            "Shape of You",
            "Blinding Lights",
            "Stay With Me",
            "Counting Stars",
            "Bad Guy",
            "Levitating",
            "Watermelon Sugar",
            "Shallow"
        };

        String[] artists = {
            "Queen",
            "Adele",
            "Ed Sheeran",
            "The Weeknd",
            "Sam Smith",
            "OneRepublic",
            "Billie Eilish",
            "Dua Lipa",
            "Harry Styles",
            "Lady Gaga & Bradley Cooper"
        };

        System.out.println("My 10 favourite songs:");
        System.out.println("======================");

        // Both arrays have the same length, so one loop is enough.
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". \"" + songs[i] + "\"  -  " + artists[i]);
        }
    }
}
