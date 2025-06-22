import java.util.*;
public class FLoatComparison {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the a value:  ");
    float a=sc.nextFloat();
    System.out.print("Enter the b value:  ");
    float b=sc.nextFloat();
    a=Math.round(a*1000)/1000;
    b=Math.round(b*1000)/1000;
    if (a==b) {
      System.out.println("the vale of a and the value of b is equal");
    }
      else{
        System.out.println("the vale of a and the value of b is notequal");
      }
      sc.close();
  }
}
