// Sum Multiples LeetCode https://leetcode.com/problems/sum-multiples/description/
// Check for the divisibilty of each of the number in range [1, n]
// and if they are divisible by 3, 5 or 7,
// keep on adding them till we reach the end of the range.

import java.util.Scanner;

class o4_LC_SumMultiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfMultiples(sc.nextInt()));
    }
}

