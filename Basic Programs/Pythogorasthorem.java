import java.util.*;
public class Pythogorasthorem{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a,b,c");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    calculation(a, b, c);
    sc.close();
  }
  public static void calculation(int a,int b,int c) {
    int p=a*a;
    int q=b*b;
    int r=c*c;
    if ((p+q)==r) {
      System.out.println(a+" "+b+" "+c+" are pythogoras triplet" );
    }
    else{
      System.out.println("it is not pythogoras triplet");
    }
    
  }
}