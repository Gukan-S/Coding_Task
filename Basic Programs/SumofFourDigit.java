import java.util.*;
public class SumofFourDigit {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int num;
    
    while (n!=0) {
      num=n%10;
      sum+=num;
      n/=10;
      
    }
    System.out.println("the sum of four digit number is: "+sum);
    sc.close();
    }
  }
