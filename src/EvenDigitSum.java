public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int count = 0;
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++) {
            int v = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            if (v % 2 == 0) {
                count += v;
            }
        }
        return count;
    }
}