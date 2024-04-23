public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
        int lastDigit = number % 10;

        return firstDigit + lastDigit;
    }
}