import java.util.*;
public class Factorial {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("the factorial ");
    int n=sc.nextInt();
    int fact=1;
    for(int i=n;i>=1;i--){
      fact*=i;
      
    }
    System.out.println("the factorail of" +n+ "is:"+fact);
    sc.close();
  }
}