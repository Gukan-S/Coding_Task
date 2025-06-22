package patterns;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5;
        AlphabetPattern2(n);
    }

    static void AlphabetPattern1(int n) {

        for (int i = 0; i < n; i++) {
            int count = n - i;
            if (i % 2 == 0) {
                char ch = (char) ('A' + n - 1);
                for (int j = 0; j < count; j++) {
                    System.out.print((char) (ch - j) + " ");

                }
            } else {
                char ch = 'A';
                for (int j = 0; j < count; j++) {
                    System.out.print((char) (ch + j) + " ");
                }
            }

            System.out.println(" ");
        }
    }

    static void AlphabetPattern2(int n) {
        for (int i = 1, p = 'E'; i <=n; i++,p--) {
            int k=p;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <=n; j++) {
                System.out.print((char)k-- +" ");
            }
            System.out.println();
        }
    }

    static void AlphabetPattern3(int n) {
        for (int i = 1, p = 'E'; i <=n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p +" ");
            }
            System.out.println("");
        }
    }
}
