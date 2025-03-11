import java.util.Scanner;
public class Fractionalpart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double fractionalPart = sum - (int) sum;
        System.out.printf("Fractional part of the sum: %.10f\n", fractionalPart);

        sc.close();
    }
}

