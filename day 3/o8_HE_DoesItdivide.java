// Does it divide Hackerearth  | https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/does-it-divide-3c60b8fb/
// The sum of numbers from 1 to N, S=N*(N+1)/2 and Product P=1*2*3*..*N
// For P to be divisible by S, All we have to do is to check whether N+1 is prime or not,
// if it is prime then sum of the numbers will not divide product of the numbers
// and if it is not prime then sum will divide product.

import java.util.*;

class o8_HE_DoesItdivide {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();

            if (N == 1) {
                System.out.println("YES");
                continue;
            }

            // If N+1 is prime, then No
            // Otherwise Yes.
            boolean isPrime = true;
            for (int i = 2; i * i <= (N + 1); ++i) {
                if ((N + 1) % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "NO" : "YES");
        }
    }
}


