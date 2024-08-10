/*
Q4 - Ugly Number
Problem Link: https://leetcode.com/problems/ugly-number/
*/

import java.util.Scanner;

class o4_LC_UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution4 obj = new Solution4();
        System.out.println(obj.isUgly(n));
        sc.close();
    }
}

//Solution Code
class Solution4 {
    public boolean isUgly(int n) {
		/*
		Return false if n <= 0 beause question specifies
		ugly number is a positive integer.
		*/
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return (n == 1);
    }
}

