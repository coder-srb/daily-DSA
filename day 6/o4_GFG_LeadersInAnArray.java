// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
// GFG : Leaders in an array

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class o4_GFG_LeadersInAnArray {

    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {

        // start from the back
        // and track the current maximum from the right side of array

        ArrayList<Integer> list = new ArrayList<Integer>();

        int currentLeader = 0;
        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] >= currentLeader) {
                currentLeader = arr[i];
                list.add(arr[i]);
            }

        }

        Collections.reverse(list);  // reversing the arraylist
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        for (int element : leaders(length, arr)) {
            System.out.print(element + " ");
        }
    }
}
