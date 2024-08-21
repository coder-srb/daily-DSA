import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/
public class o2_LC_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];

        /*
            if (k % n == 0) => k = 0  [bcz there will be a full rotation, so array remains same after rotation]
            if (k % n == x) => k = x  [k>n || k<n]
        */
        k = k % n;
        int pivot = n - k;
        int x = 0;

        for (int i = pivot; i < n; i++) {  // rotated part
            res[x] = nums[i];
            x++;
        }

        for (int i = 0; i < pivot; i++) {  // not rotated part
            res[x] = nums[i];
            x++;
        }

        for (int i = 0; i < n; i++) {  // assigning the rotated array values to the original array
            nums[i] = res[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, -100, 3, 99};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
