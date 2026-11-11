/**
 * Workshop 6 - Exercise 7 (Medium)
 *
 * Driver class - contains main() and makes the calls to the Boxes class.
 */
public class Ex07BoxesDriver {

    public static void main(String[] args) {

        // Two boxes made with the constructor, like the example in the worksheet.
        Boxes small = new Boxes(5);
        Boxes large = new Boxes(8);

        small.draw();
        large.draw();

        // Use the setter to change the size of an existing box.
        large.setBoxSize(3);
        large.draw();

        // toString() is used by System.out.println automatically.
        System.out.println("The small box is a " + small + " box.");

        // The setter protects the maximum size of 10.
        small.setBoxSize(11);

        // Extension: the same box drawn with the Unicode horizontal line.
        Boxes ten = new Boxes(10);
        ten.drawUnicode();
    }
}
