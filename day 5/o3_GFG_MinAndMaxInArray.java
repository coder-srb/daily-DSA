// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

import java.util.Scanner;

public class o3_GFG_MinAndMaxInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int length = in.nextInt();
        long[] arr = new long[length];

        System.out.println("Enter elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextLong();
        }

        Pair result = getMinMax(arr, length);
        System.out.println("Minimum: " + result.min + ", Maximum: " + result.max);
    }

    static Pair getMinMax(long a[], int n) {
        long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;

        // Iterating over the array
        for (int i = 0; i < n; i++) {
            // Updating the minimum value
            mn = Math.min(a[i], mn);
            // Updating the maximum value
            mx = Math.max(a[i], mx);
        }

        // Returning the minimum and maximum values as a pair
        return new Pair(mn, mx);
    }
}

class Pair {
    long min, max;

    Pair(long min, long max) {
        this.min = min;
        this.max = max;
    }
}
