/*
    https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

    Given a sorted array Arr of size N and a number X,
    you need to find the number of occurrences of X in Arr.
 */

public class o5_GFG_NumberOfOccurrenceInSortedArray {
    static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int ans = -1;  // if element not found return -1
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {  // first occurance
                    end = mid - 1;
                } else {            // last occurance
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static int count(int[] nums, int n, int x) {

        //check for first occurance of target
        int first = search(nums, x, true);

        //check for last occurance of target
        int last = search(nums, x, false);

        // always check the target is present or not then return value
        return first != -1 ? (last - first) + 1 : 0;  // number of occurances
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 8, 8, 10};
        int target = 8;
        System.out.println(count(arr, arr.length, target));
    }
}
