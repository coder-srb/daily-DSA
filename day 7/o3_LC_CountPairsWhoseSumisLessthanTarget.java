// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
// LeetCode:Count Pairs Whose Sum is Less than Target


/*
 Simply run two loop check each pair that their sum is less than target or not.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class o3_LC_CountPairsWhoseSumisLessthanTarget {
    public static int countPairs(ArrayList<Integer> nums, int target) {
        int res = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println("target: ");
        int target = in.nextInt();

        System.out.println(countPairs(list, target));
    }
}
