
import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    pattern2(n);
  }
  static void pattern1(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
  static void pattern2(int n){
    for(int i=0;i<=n;i++){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
