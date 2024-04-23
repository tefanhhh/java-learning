public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;
        decide(switchValue);
    }

    public static void decide(int val) {
        switch (val) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + val);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}
