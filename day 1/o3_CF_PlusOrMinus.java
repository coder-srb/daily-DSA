/*
Q3 - Plus or Minus
Problem Link: https://codeforces.com/problemset/problem/1807/A
*/

import java.util.Scanner;

public class o3_CF_PlusOrMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b == c) {
                System.out.println('+');
            } else {
                System.out.println('-');
            }
        }
        sc.close();
    }
}
