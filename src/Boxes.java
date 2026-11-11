/**
 * Workshop 6 - Exercise 7 (Medium)
 *
 * Boxes class - draws a square box of a given size on the console.
 *   '-' (or the Unicode box line) draws the top and bottom,
 *   '|' draws the two sides.
 *
 * Required members:
 *   Boxes(int size)  - constructor that accepts the size
 *   setBoxSize(int)  - sets the size (maximum 10)
 *   toString()       - returns the size as a String, e.g. "10 x 10"
 *   draw()           - draws the box on the console
 */
public class Boxes {

    private static final int MAX_SIZE = 10;

    private int boxSize;

    /** Constructor - accepts the size of the box. */
    public Boxes(int size) {
        setBoxSize(size);
    }

    /** Set the size of the box. Sizes below 2 or above 10 are rejected. */
    public void setBoxSize(int size) {
        if (size < 2 || size > MAX_SIZE) {
            System.out.println("Invalid size " + size + ". The size must be between 2 and "
                               + MAX_SIZE + ". The box stays at " + boxSize + ".");
        } else {
            this.boxSize = size;
        }
    }

    /** Read the size of the box. */
    public int getBoxSize() {
        return boxSize;
    }

    /** Returns the size of the box as a String, for example "10 x 10". */
    @Override
    public String toString() {
        return boxSize + " x " + boxSize;
    }

    /** Draw the box on the console using '-' for top/bottom and '|' for sides. */
    public void draw() {
        System.out.println("Box size: " + this);
        drawBox('-');
        System.out.println();
    }

    /**
     * Extension - draw the box with the Unicode horizontal line character
     * (String line = "\u2500";) instead of the hyphen.
     */
    public void drawUnicode() {
        System.out.println("Box size: " + this + "  (Unicode line character)");
        drawBox('\u2500');
        System.out.println();
    }

    /** Shared drawing code, only the horizontal character changes. */
    private void drawBox(char horizontal) {
        String topBottom = String.valueOf(horizontal).repeat(boxSize);

        // Top line
        System.out.println(topBottom);

        // Middle lines: a side character, blank space, a side character.
        String middle = "|" + " ".repeat(boxSize - 2) + "|";
        for (int row = 0; row < boxSize - 2; row++) {
            System.out.println(middle);
        }

        // Bottom line
        System.out.println(topBottom);
    }
}
