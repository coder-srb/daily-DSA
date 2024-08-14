// https://leetcode.com/problems/number-of-employees-who-met-the-target/

public class o6_LC_NumberofEmployeesWhoMettheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hrs : hours) {
            if (hrs >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}
