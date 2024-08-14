/*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    Given an array of integers nums sorted in non-decreasing order,
    find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
 */

public class o4_LC_FirstAndLastPositionInSortedArray {

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

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        //check for first occurance of target
        int first = search(nums, target, true);

        //check for last occurance of target
        int last = search(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 8, 8, 10};
        int target = 8;
        System.out.println(java.util.Arrays.toString(searchRange(arr, target)));
    }
}
