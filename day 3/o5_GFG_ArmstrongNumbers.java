import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
class o5_GFG_ArmstrongNumbers {
    static String armstrongNumber(int n) {
        // An Armstrong number of three digits is an integer such that
        // the sum of the cubes of its digits is equal to the number itself.
        // Solution: Extract each digit of the number and cube it and keep adding that in a variable sum.
        // At the end if sum==n then number is an Armstrong Number otherwise not


        // 1st method
        // int temp = n;
        // int checkArmstrong = 0;
        // while(temp > 0){
        //     int remainder = temp % 10;
        //     checkArmstrong += Math.pow(remainder, 3);
        //     temp /= 10;
        // }

        // if(checkArmstrong == n) return "true";

        // return "false";


        // 2nd method
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += (i % 10) * (i % 10) * (i % 10);
        }
        if (sum == n) return "true";
        return "false";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(armstrongNumber(sc.nextInt()));
    }
}


