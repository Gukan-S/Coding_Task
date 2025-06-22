
import java.util.Scanner;
public class CalculatethesumofMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number (M): ");
        int M = sc.nextInt();
        System.out.print("Enter ending number (N): ");
        int N = sc.nextInt();

        int sum = (N * (N + 1) / 2) - (M * (M - 1) / 2);

        System.out.println("Sum from " + M + " to " + N + " = " + sum);

        sc.close();
    }
}

