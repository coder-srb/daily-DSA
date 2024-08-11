/* FizzBuzz
	 https://www.hackerrank.com/challenges/fizzbuzz/problem
	*/


class o1_HR_FizzBuzz {
    public static void main(String[] args) {
         /*
 Basic idea- Iterating from 1 to 100, and checking for each
 number whether it is multiple of 3 and 5 both, or multiple of 3 only
 or multiple of 5 only, otherwise printing the number
 */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

