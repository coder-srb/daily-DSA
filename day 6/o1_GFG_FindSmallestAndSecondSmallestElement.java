// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
// GFG: Find the smallest and second smallest element in an array

import java.util.Arrays;

public class o1_GFG_FindSmallestAndSecondSmallestElement {
    public static int[] minAnd2ndMin(int arr[]) {
        // code here

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min1)  // smallest number
            {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1)  // 2nd smallest number
            {
                min2 = x;
            }

        }

        if ((min2 == Integer.MAX_VALUE) || (min1 == Integer.MAX_VALUE)) {
            int ans[] = {-1};
            return ans;
        } else {
            int ans[] = {min1, min2};
            return ans;
        }


        /*
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = smallest1;

        for(int i =0; i<arr.length; i++){  // smallest number

            if(smallest1 > arr[i]){
                smallest1 = arr[i];
            }

        }

        for(int i = 0; i<arr.length; i++){   // 2nd smallest number

            if(smallest2 > arr[i] && arr[i] > smallest1){
                smallest2 = arr[i];
            }

        }

        return new int[] {smallest1, smallest2};
        */
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 6};
        System.out.println(Arrays.toString(minAnd2ndMin(arr)));
    }
}
