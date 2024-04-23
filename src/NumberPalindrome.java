public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int r, sum = 0, temp;
        temp = number;

        while(number > 0) {
            r = number % 10;
            sum = ( sum * 10) + r;
            number = number / 10;
        }

        return temp == sum;
    }
}