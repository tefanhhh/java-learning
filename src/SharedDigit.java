public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 25));
    }

    public static boolean hasSharedDigit(int start, int end) {
        boolean isStartInclusive = start >= 10 && start <= 99;
        boolean isEndInclusive = end >= 10 && end <= 99;

        if (!isStartInclusive || !isEndInclusive) {
            return false;
        }

        String startString = Integer.toString(start);
        String endString = Integer.toString(end);

        for (int i = 0; i < startString.length(); i++) {
            for (int j = 0; j < endString.length(); j++) {
                if (startString.charAt(i) == endString.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }
}