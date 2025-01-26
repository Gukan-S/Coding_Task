import java.util.*;
public class Greatestoftwo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a value:");
    int a=sc.nextInt();
    System.out.println("enter the b value");
    int b=sc.nextInt();
    if(a>b){
      System.out.println("A is greater");
    }
    else if(b>a){
      System.out.println("B is greatest");
    }
    else{
      System.out.println("both are equal");
    }
    sc.close();
  }
}
