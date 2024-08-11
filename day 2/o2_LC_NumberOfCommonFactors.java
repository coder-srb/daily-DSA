/* https://leetcode.com/problems/number-of-common-factors/ */

import java.util.Scanner;

class o2_LC_NumberOfCommonFactors {

	   /*Basic idea is Common factors of both numbers will
   be upto smaller number only. Therfore iterated upto
   minm of these two, and checked whether the number is
   factor of both or not.*/

    public static int commonFactors(int a, int b) {
        int count = 0;
        int n = Math.min(a, b);
        for (int i = 1; i < n + 1; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println(commonFactors(in.nextInt(), in.nextInt()));
    }
}


