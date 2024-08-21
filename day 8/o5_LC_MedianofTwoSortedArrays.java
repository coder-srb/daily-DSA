// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class o5_LC_MedianofTwoSortedArrays {

    static int[] mergeSort(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            } else {
                merged[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] res = new int[n];

        res = mergeSort(nums1, nums2);

        if (n % 2 == 0) {
            int mid1 = n / 2;
            int mid2 = mid1 - 1;

            double ans = (double) (res[mid1] + res[mid2]) / 2;
            return ans;
        }
        return res[n / 2];
    }

    public static void main(String[] args) {
        int nums1[] = {1, 3};
        int nums2[] = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
