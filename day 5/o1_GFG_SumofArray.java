// https://www.geeksforgeeks.org/problems/sum-of-array2326/0

import java.util.Scanner;

public class o1_GFG_SumofArray {
    static int sum(int arr[], int n) {
        // code here
        int ans = 0;
        for (int i = 0; i < n; i++) ans += arr[i];
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int length = in.nextInt();
        int[] arr = new int[length];

        System.out.println("enter elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("SumofArray: " + sum(arr, length));
    }
}

