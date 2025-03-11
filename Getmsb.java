import java.util.Scanner;
public class Getmsb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num >= 10) {
            num /= 10; 
        }
        System.out.println("Most Significant Digit (MSB): " + num);

        sc.close();
    }
}

