import java.util.Scanner;

public class o5_GFG_PrimeNumber {
    static int isPrime(int N) {
        // A prime number is a number which is only divisible by 1 and itself.
        if (N <= 1) return 0;

        for (int i = 2; i * i <= N; i++) {  // i <= Math.sqrt(N)
            if (N % i == 0) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPrime(in.nextInt()));
    }
}
