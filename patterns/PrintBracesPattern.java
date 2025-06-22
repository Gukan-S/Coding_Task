//Print braces pattern program
//int n=2
//Output:
//        { }
//        { } {{ }}
package patterns;

public class PrintBracesPattern {
    public static void main(String[] args) {

        int n = 2;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                for (int j = 1; j <= k; j++) {
                    System.out.print("{");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("}");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
