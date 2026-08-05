package arrays.logicbuilding;

public class SumOfDigits {

    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int number = 1234;
        System.out.println(sumOfDigits(number));
    }

    public static class Fibonacci {

        public static void fibonacci(int number) {

            int first = 0, second = 1;

            for (int i = 1; i <= number; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }

        public static void main(String[] args) {

            int number = 10;
            fibonacci(number);
        }
    }

    public static class Palindrome {

        public static boolean isPalindrome(int number) {

            int original = number;
            int reverse = 0;

            while (number > 0) {
                int rem = number % 10;
                reverse = reverse * 10 + rem;
                number = number / 10;
            }

            return original == reverse;
        }

        public static void main(String[] args) {

            int number = 121;
            System.out.println(isPalindrome(number));
        }
    }
}