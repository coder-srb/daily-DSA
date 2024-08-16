// Not able to solve this. try again later
// https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/make-it-non-decreasing-7d3391fd/
// HACKEREARTH : Non-decreasing arrays

// iterating for a given i, we have
// we have to find b[i]
// which is smallest number divisible by a[i] and greater than b[i-1]
// hence, we can write
// b[i] = f*a[i] and f*a[i] > b[i-1]
// f > b[i-1]/a[i] => f = ceil(b[i-1]/a[i])
// Hence,
// b[i] = arr[i]*ceil(b[i-1]/arr[i])

import java.util.*;

class o1_HE_NonDecreasingArrays {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while ((test_cases--) > 0) {
            int n = scanner.nextInt();
            long prev = scanner.nextLong();
            sb.append(prev + " ");
            for (int i = 1; i < n; i++) {
                long curr = scanner.nextLong();
                curr = curr * ((curr + prev - 1) / curr);
                prev = curr;
                sb.append(curr + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
