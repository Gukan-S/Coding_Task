import java.util.*;
public class Countdigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the digit:");
    int n=sc.nextInt();
    int count=0;
    while (n>0) {
      n /=10;
      count++;
    }
    System.out.println("The Digit is:"+count);
    sc.close();
  }
}
