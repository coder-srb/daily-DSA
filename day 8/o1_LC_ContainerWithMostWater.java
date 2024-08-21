// https://leetcode.com/problems/container-with-most-water/

public class o1_LC_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int lp = 0;   // left pointer
        int rp = height.length - 1;    // right pointer

        int maxWater = Integer.MIN_VALUE;
        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);  // finding minimum height
            int width = rp - lp;    // finding width

            int area = ht * width;  // current water storage
            maxWater = Math.max(maxWater, area);   // maximum water storage

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
