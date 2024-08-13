// https://read.learnyard.com/square-star-and-rhombus-start-patterns/

/*  Hollow Square Star Pattern with Diagonal
         *****
         ** **
         * * *
         ** **
         *****
 */

public class o3_HollowSquareStarPatternWithDiagonal {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                /*
                  Print star for;
                     * first row (i==1) or
                     * last row (i==N) or
                     * first column (j==1) or
                     * last column (j==N) or
                     * row equal to column (i==j) or
                     * column equal to N-row (j==N-i+1)   while i & j starts at '1'
                 */

                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();

        }
    }
}
