/**
 * Workshop 6 - Exercise 2 (Hard)
 *
 * Same data as Exercise 1, but the songs are printed in alphabetical order.
 * A bubble sort is used, and the two arrays are swapped together so that
 * every artist stays matched with its own song.
 */
public class Ex02FavoriteSongsSorted {

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

        // ---------- Bubble sort ----------
        // Outer loop: at most (n - 1) passes are needed.
        // Inner loop: compare neighbours and swap them when they are out of order.
        // compareToIgnoreCase() returns a negative number when the first String
        // comes before the second one in the alphabet, ignoring A vs a.
        for (int pass = 0; pass < songs.length - 1; pass++) {
            for (int i = 0; i < songs.length - 1 - pass; i++) {
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {

                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    // Keep the artist matched with the song.
                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;
                }
            }
        }

        System.out.println("My 10 favourite songs (alphabetical order):");
        System.out.println("==========================================");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". \"" + songs[i] + "\"  -  " + artists[i]);
        }
    }
}
