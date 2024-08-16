// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
// Leetcode: Replace Elements with Greatest Element on Right Side

import java.util.Arrays;
import java.util.Scanner;

public class o2_LC_ReplaceElementsWithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr) {
        /*
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                max = Math.max(max, arr[j]);
            }
            arr[i] = max;
        }
        arr[n-1] = -1;

        return arr;
        */


        /*
    Iterate from the right to the left,
    We initilize max_right = -1, where max_right represent the max on the right.
    Each round, we set arr[i] = max_right, where max_right is maximum element on the right.
    Also we update max_right = max(max_right, arr[i]).
*/
        int n = arr.length;
        int[] ans = new int[n];
        int maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = maxRight;
            if (maxRight < arr[i]) {
                maxRight = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
