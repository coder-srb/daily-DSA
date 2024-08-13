// https://read.learnyard.com/square-star-and-rhombus-start-patterns/

/*  Mirrored Rhombus Star Pattern
         *****
          *****
           *****
            *****
             *****

    If we remove leading spaces the pattern becomes a simple square star pattern of N rows and columns.
    The pattern consists of i - 1 spaces per row (where i is current row number).
 */
public class o5_MirroredRhombusStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int sp = 1; sp <= (i - 1); sp++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
