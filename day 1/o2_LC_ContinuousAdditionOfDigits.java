/*
Q2 - Add Digits
Problem Link: https://leetcode.com/problems/add-digits/
*/

import java.util.Scanner;

class o2_LC_ContinuousAdditionOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution2 obj = new Solution2();
        System.out.println(obj.addDigits(n));
        sc.close();
    }
}

class Solution2 {
    public int addDigits(int num) {
        while (num >= 10) {
			/*
			Find current digit sum at each step until
			digit sum reaches a value <= 9.
			*/
            int currSum = 0;
            while (num > 0) {
                currSum += num % 10;
                num /= 10;
            }
            num = currSum;
        }
        return num;

	// another way
	/*
	if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9; 
	*/
    }
}

