/**
 * Workshop 6 - Exercise 6 (Easy) - driver class
 *
 * Answers:
 *   Class variable    : x  (public static int x = 7;)
 *   Instance variable : y  (public int y = 3;)
 *
 * The code below is the code from the worksheet. Because x is static there is
 * only ONE x shared by a and b, so "b.x = 2" also changes a.x. Because y is an
 * instance variable, a.y and b.y are two different variables.
 * The last line prints the class variable through the class name and shows the
 * same shared value.
 */
public class Ex06IdentifyMyPartsApp {

    public static void main(String[] args) {

        System.out.println("Class variable    : x  (declared with 'static', shared by all objects)");
        System.out.println("Instance variable : y  (no 'static', each object has its own copy)");
        System.out.println();

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
