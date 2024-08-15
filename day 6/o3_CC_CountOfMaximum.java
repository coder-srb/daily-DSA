

// https://www.codechef.com/problems/MAXCOUNT
// CODECHEF: MAXCOUNT

// Make a count array to count each element with the given value


import java.util.Arrays;
import java.util.Scanner;

public class o3_CC_CountOfMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Length of the array

            int[] A = new int[N];  // The array A

            // Read the array elements
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Array to store the frequency of elements
            int[] frequency = new int[10001]; // Size 10001 since 1 ≤ A[i] ≤ 10000

            // Fill the frequency array
            for (int i = 0; i < N; i++) {
                frequency[A[i]]++;
            }

//            System.out.println(Arrays.toString(frequency));

            // Find the element with the maximum frequency
            int maxFrequency = 0;
            int maxValue = 10001; // Start with a value greater than the max possible A[i]

            for (int i = 1; i <= 10000; i++) {  // 1 ≤ A[i] ≤ 10000
                if (frequency[i] > maxFrequency) {
                    maxFrequency = frequency[i];
                    maxValue = i;
                } else if (frequency[i] == maxFrequency && i < maxValue) {
                    maxValue = i;
                }
            }

            // Output the result for this test case
            System.out.println(maxValue + " " + maxFrequency);
        }

        scanner.close();
    }
}

