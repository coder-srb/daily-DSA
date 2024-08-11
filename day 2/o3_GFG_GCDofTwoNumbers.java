import java.util.Scanner;

/*
https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
*/
class o3_GFG_GCDofTwoNumbers {
    static int gcd(int a, int b) {
        // ---- method 1 ----
        /*
            gcd of them will be smaller than or equal to minimum
            of these, then we just checked if the chosen number
            is dividing both of them or not
        */
//        int result = Math.min(a, b);  // Find Minimum of a and b
//        while (result > 0) {
//            if (a % result == 0 && b % result == 0) {
//                break;
//            }
//            result--;
//        }
//
//        // Return gcd of a and b
//        return result;


        // ---- method 2 ----
        while (a != b) {
            /*
                find the bigger one between a & b;
                subtract the smaller one from the bigger one,
                store it inside bigger one,
                keep doing this unitill both the numbers become same
            */
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(gcd(in.nextInt(), in.nextInt()));
    }
}

