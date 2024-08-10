/*
Q1 - Sum of Digits
Problem link: https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
*/

import java.util.Scanner;

public class o1_GFG_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution1 obj = new Solution1();
        System.out.println(obj.sumOfDigits(n));
        sc.close();
    }
}

//Solution Code
class Solution1 {
    static int sumOfDigits(int N) {
        int ans = 0;

        while (N > 0) {
			/*
			At each step extract the last digit of N (N%10),
			add it to ans,
			and remove the extracted digit from N (N/10).
			*/
            ans += N % 10;
            N /= 10;
        }

        return ans;
    }
}


