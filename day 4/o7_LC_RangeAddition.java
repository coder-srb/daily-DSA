/*
        Range Addition : https://leetcode.com/problems/range-addition/description/
        https://leetcode.ca/2016-12-04-370-Range-Addition/
 */

import java.util.Scanner;

public class o7_LC_RangeAddition {

    public static int[] getModifiedArray(int length, int[][] queries) {
        int[] res = new int[length];   // initializing the array with all "0"

        // provide impact ti res[]
        for (int q = 0; q < queries.length; q++) {

            // define "startingIndex", "endingIndex", "increment"
            int startingIndex = queries[q][0];
            int endingIndex = queries[q][1];
            int increment = queries[q][2];

            // add "increment" to the "startingIndex" at the beginning of the coordinate
            res[startingIndex] += increment;

            // add "- increment" to the position "endingIndex + 1"
            if (endingIndex + 1 < length) {
                res[endingIndex + 1] -= increment;
            }
        }

        // prefix-sum array (two methods)
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum += res[i];
//            res[i] = sum;
//        }

        for (int i = 1; i < length; i++) {
            res[i] += res[i - 1];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int noOfQueries = in.nextInt();

        int[][] queries = new int[noOfQueries][3];

        for (int q = 0; q < noOfQueries; q++) {
            queries[q][0] = in.nextInt();
            queries[q][1] = in.nextInt();
            queries[q][2] = in.nextInt();
        }

        int res[] = getModifiedArray(length, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

// sol: https://www.youtube.com/watch?v=fBT0VKkqvtY&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl
