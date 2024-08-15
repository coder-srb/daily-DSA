// https://leetcode.com/problems/minimum-number-game/description/
// LEETCODE : MINIMUM NUMBER GAME

import java.util.Arrays;
import java.util.Scanner;

public class o6_LC_MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(numberGame(arr));
    }
}
