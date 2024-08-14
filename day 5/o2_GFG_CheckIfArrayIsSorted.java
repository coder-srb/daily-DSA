// https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

import java.util.Scanner;

class o2_GFG_CheckIfArrayIsSorted {
    public static boolean arraySortedOrNot(int[] arr, int n) {
        if (n == 0 || n == 1)  //Array is having either one or no element
            return true;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) // Any unsorted pair found
                return false;
        }
        return true; // No unsorted pair found
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
        System.out.println(arraySortedOrNot(arr, length));
    }
}

/*

// Java Recursive approach to check if an
// Array is sorted or not
class GFG {

    // Function that returns true if array is
    // sorted in non-decreasing order.
    static boolean arraySortedOrNot(int a[], int n)
    {
          // base case
        if (n == 1 || n == 0)
            return true;

          // check if present index and index
        // previous to it are in correct order
        // and rest of the array is also sorted
        // if true then return true else return
        // false
        return a[n - 1] >= a[n - 2]
            && arraySortedOrNot(a, n - 1);
    }

    // Driver code
    public static void main(String[] args)
    {

        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;

          // Function Call
        if (arraySortedOrNot(arr, n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}

 */
