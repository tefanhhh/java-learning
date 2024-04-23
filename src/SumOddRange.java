public class SumOddRange {
    public static void main(String[] args) {
        int sum = sumOdd(1, 100);
        System.out.println(sum);
    }

    public static boolean isOdd(int number) {
        if (number < 1) return false;
        return (number % 2) != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (SumOddRange.isOdd(i)) sum += i;
        }
        return sum;
    }
}