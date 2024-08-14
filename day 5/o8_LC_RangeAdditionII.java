// https://leetcode.com/problems/range-addition-ii/description/

import java.util.Scanner;

public class o8_LC_RangeAdditionII {

    public static int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;

        /*
         ops[][] == [[row, col], [row, col]]
         find the minimum row value and minimum column value  bcz these are the intersection of all ops[][]
         return the minRow * minCol (=> the number of maximum integers)
        */
        for (int i = 0; i < ops.length; i++) {
            row = Math.min(row, ops[i][0]); // min row
            col = Math.min(col, ops[i][1]); // min col
        }

        return row * col;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row size of array: ");
        int row = in.nextInt();
        System.out.println("enter col size of array: ");
        int col = in.nextInt();
        int[][] ops = {{2, 3}, {3, 2}};

        System.out.println(maxCount(row, col, ops));
    }
}
