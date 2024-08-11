import java.util.Scanner;

/*
https://leetcode.com/problems/power-of-two/
*/
class o4_LC_PowerOfTwo {
	 /*
         If a number is perfect power of 2 then the number is in
        form of 2 * 2 * 2 * ......* 2 * 1,
        if we remove all factor of 2 from this number then at last
        number is converted to 1.
        so to check if a number is perfect power of we remove
        all factor of 2 and at last if number is 1 then this is power
        perfect of 2 otherwise not.
        we can do this as
    */

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;

        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPowerOfTwo(in.nextInt()));
    }

}

