import java.util.Scanner;

// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
// LEETCODE : COUNT ELEMENTS WITH MAXIMUM FREQUENCY
public class o5_LC_CountElementsWithMaximumFrequency {

    public static int maxFrequencyElements(int[] nums) {
        // Array to store the frequency of elements
        int[] frequency = new int[101];  // Size 101 since 1 <= nums[i] <= 100

        // Fill the frequency array
        for (int i = 0; i < nums.length; i++) {
            frequency[nums[i]]++;
        }
        // System.out.print(Arrays.toString(frequency));

        // Selecting the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i <= 100; i++) {
            maxFrequency = Math.max(maxFrequency, frequency[i]);
        }

        int ans = 0;
        // finding all the numbers with frequency == maximum frequency
        // then adding their friequecies
        for (int val : frequency) {
            if (maxFrequency == val) {
                ans += val;
            }
        }
        return ans;
/*
        int[] frequency = new int[101];
        int maxFrequency = 0;
        int numWithMaxFreq = 0;

        for (int num : nums) {

            int f = ++frequency[num];

            if (f > maxFrequency) {
                maxFrequency = f;
                numWithMaxFreq = 1;
            } else if (f == maxFrequency)
                numWithMaxFreq++;
        }

        return numWithMaxFreq * maxFrequency;
*/
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(maxFrequencyElements(arr));
    }
}
