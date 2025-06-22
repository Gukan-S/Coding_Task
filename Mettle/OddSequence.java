public class OddSequence {
    public static void main(String[] args) {
        int n = 361589;
        System.out.println(OddArrangements(n));
    }

    static String OddArrangements(int n) {
        String str = Integer.toString(n);
        String odd = "";
        String even = "";
        int countodd=0;
        int counteven=0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            if (digit % 2 != 0) {
                odd += digit;
                countodd++;
            }
            if (digit % 2 == 0) {
                even += digit;
                counteven++;
            }

        }
        return odd +countodd+ even+counteven;
    }
}
