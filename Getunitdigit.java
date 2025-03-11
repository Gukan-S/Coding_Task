import java.util.Scanner;
public class Getunitdigit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=sc.nextInt();
    int unitdigit=n%10;
    System.out.println("the unit digit of "+n+" is "+unitdigit);
    sc.close();
  }
}
