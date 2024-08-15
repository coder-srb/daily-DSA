// https://codeforces.com/problemset/problem/1711/A
// CODEFORCES : PERFECT PERMUTATION

import java.util.Scanner;

public class o2_CF_PerfectPermutation {

    public static void printPermutation(int n) {

        System.out.print(n + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            printPermutation(n);
        }
    }
}
