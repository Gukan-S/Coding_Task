import java.util.*;
public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:");
    int no=sc.nextInt();
    if(no%2==0){
      System.out.println("the number" +no+ "is even");
    }
    else{
      System.out.println("the number" +no+ "is odd");
    }
    sc.close();
  }
}
