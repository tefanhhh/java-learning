public class LastDigitChecker {
    public static boolean hasSameLastDigit(int start, int middle, int end) {
        boolean isStartInclusive = isValid(start);
        boolean isMiddleInclusive = isValid(middle);
        boolean isEndInclusive = isValid(end);

        if (!isStartInclusive || !isMiddleInclusive || !isEndInclusive) {
            return false;
        }

        int ldStart = start % 10, ldMiddle = middle % 10, ldEnd = end % 10;

        return ldStart == ldMiddle || ldStart == ldEnd || ldMiddle == ldEnd;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
