import java.util.Scanner;

public class StableorUnstable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inp1 = 1919;
        int inp2 = 888;
        int inp3 = 788;
        int inp4 = 4040;
        int inp5 = 102;

        int result = processNumbers(inp1, inp2, inp3, inp4, inp5);
        System.out.println(result);
    }

    public static int processNumbers(int n1, int n2, int n3, int n4, int n5) {
        int sumStable = 0, sumUnstable = 0;

        if (isStable(n1)) sumStable += n1; else sumUnstable += n1;
        if (isStable(n2)) sumStable += n2; else sumUnstable += n2;
        if (isStable(n3)) sumStable += n3; else sumUnstable += n3;
        if (isStable(n4)) sumStable += n4; else sumUnstable += n4;
        if (isStable(n5)) sumStable += n5; else sumUnstable += n5;

        return sumStable - sumUnstable;
    }

    public static boolean isStable(int num) {
        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        int expectedFreq = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                if (expectedFreq == 0) {
                    expectedFreq = freq[i];
                } else if (freq[i] != expectedFreq) {
                    return false;
                }
            }
        }
        return true;
    }
}



