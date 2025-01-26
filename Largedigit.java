import java.util.*;
public class Largedigit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int a=sc.nextInt();
    int n,large=0;
    n=a%10;
    if(n>large){
      large=n;
    }
    System.out.println("largest number is" +large);
    sc.close();
  }
 
}
