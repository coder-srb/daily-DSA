// GCD vs LCM | https://codeforces.com/problemset/problem/1665/A

/*
    It is very difficult to have (GCD = LCM). But in 1 case we know it is very easy to find it.
    (GCD = LCM) => 1 = 1
    so from four outputs let's take two as '1', LCM(1,1) = 1
    and selecting two numbers having GCD = 1 is very easy, bz we know one of them will be surely 1.
    so to find the last output we will use given condition; a+b+c+d=n => d = n-(a+b+c) = n-3 ; as other three outputs are 1.
 */

// For a=n-3,b=1,c=1 and d=1, we can see that a+b+c+d=n and gcd(a,b)=lcm(c,d)=1

import java.util.Scanner;

public class o7_CF_GCDvsLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.print(n - 3 + " " + 1 + " " + 1 + " " + 1);
            System.out.println();
        }
    }
}
