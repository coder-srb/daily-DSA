/*
    LeetCode: 925. Long Pressed Name
    https://leetcode.com/problems/long-pressed-name/description/
 */

import java.util.Scanner;

class o6_LC_LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {

        if (name.length() > typed.length()) return false;

        int i = 0, j = 0;

        while (i < name.length() && j < typed.length()) {

            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // name: "aab", typed: "bb"  -- for this case we have to mention special condition [i > 0], otherwise index-out-of-bound error
            else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            }
            // name.charAt(i) != typed.charAt(j)
            else {
                return false;
            }
        }

        // name: "alex", typed: "aaleexa" -- when [i < name.length()] condition of while
        // loop, become false
        while (j < typed.length()) {
            if (name.charAt(i - 1) != typed.charAt(j)) return false;
            j++;  // name: "vtkgn"  typed: "vttkgnn"
        }

        // name: aabbcc, typed: aaabbb -- when [j < typed.length()] condition of while
        // loop, become false
        return i < name.length() ? false : true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println (isLongPressedName (in.nextLine(), in.nextLine()));
    }
}


// sol:  https://youtu.be/738Dy3D-q-E?si=gctmscVzV305GxNn
