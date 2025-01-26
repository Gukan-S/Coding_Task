import java.util.Scanner;
public class Addthreenum {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a:");
    int a=sc.nextInt();
    System.out.println("Enter the b:");
    int b=sc.nextInt();
    System.out.println("Enter the c:");
    int c=sc.nextInt();
    int sum=a+b+c;
    System.out.println("Sum of three num is:"+sum);
    sc.close();
  }
}