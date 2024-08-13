// https://read.learnyard.com/square-star-and-rhombus-start-patterns/

/* Square Star Pattern
     *****
     *****
     *****
     *****
     *****
 */

public class o1_SquareStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
