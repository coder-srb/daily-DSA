/*
Q5 - Sum of Round Numbers
Problem Link: https://codeforces.com/contest/1352/problem/A
*/

import java.util.Scanner;
import java.util.ArrayList;

// Make sure class is public before submitting on codeforces
public class o5_CF_SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int currPowOfTen = 1;
			/*
			ArrayList is an array of variable size in Java.
			It will be covered later in the course.
			*/
            ArrayList<Integer> ans = new ArrayList<Integer>();
            while (n > 0) {
                int dig = n % 10;
                n /= 10;
                if (dig > 0) {
                    ans.add(dig * currPowOfTen);
                }
                currPowOfTen *= 10;
            }
            System.out.println(ans.size());
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


