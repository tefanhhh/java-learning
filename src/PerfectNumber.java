public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int result = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    result += i;
                }
            }
            result /= 2;
            System.out.println(result);
            return result == number;
        }
    }
}
