/*
Q6 - Number of Common Factors
Problem Link: https://leetcode.com/problems/number-of-common-factors/
*/

import java.util.Scanner;

class o6_LC_NumberOfCommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution6 obj = new Solution6();
        System.out.println(obj.commonFactors(a, b));
        sc.close();
    }
}

//Solution Code
class Solution6 {
    public int commonFactors(int a, int b) {
        int ans = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
			/*
			If i can divide both a and b, then i is a common factor
			*/
            if (a % i == 0 && b % i == 0) ans++;
        }
        return ans;
    }
}


