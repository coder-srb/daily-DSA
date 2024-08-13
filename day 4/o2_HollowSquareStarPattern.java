// https://read.learnyard.com/square-star-and-rhombus-start-patterns/

/*  Hollow Square Star Pattern
        *****
        *   *
        *   *
        *   *
        *****

    We basically need to print two things "*"(asterisks) and " "(space). Think of conditions.
    When you will print what? Print star if row==1 or row==N or column==1 or column==N otherwise print space.
 */
public class o2_HollowSquareStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                /*
                    Print star for 1st, Nth row and column
                    Print star for;
                     * first row (i==1) or
                     * last row (i==N) or
                     * first column (j==1) or
                     * last column (j==N)
                 */

                if (i == 1 || i == n || j == 1 || j == n) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();

        }
    }
}
