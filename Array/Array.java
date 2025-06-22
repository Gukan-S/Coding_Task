import java.time.LocalDateTime;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    // int [] n={2,5,6,7};
    // int four=n[2];
    // System.out.println(four);
    Scanner sc= new Scanner(System.in);
    int age= sc.nextInt();
    int n=LocalDateTime.now().minusYears(age).getYear();
    System.out.println(n);
    sc.close();
    
  }
}
