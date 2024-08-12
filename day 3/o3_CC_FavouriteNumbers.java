// Favourite Numbers Codechef  https://www.codechef.com/problems/FAVOURITENUM
// Here we check if the number is divisible by both 2 and 7 then alice will take it
// else if the number is not divisible by 2 but divisible by 9 then bob will take it
// otherwise charlie will take it

import java.util.Scanner;

public class o3_CC_FavouriteNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            // Your code goes here
            if (a % 2 == 0 && a % 7 == 0) System.out.println("Alice");
            else if (a % 2 != 0 && a % 9 == 0) System.out.println("Bob");
            else System.out.println("Charlie");
        }
    }
}

