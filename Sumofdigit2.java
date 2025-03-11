import java.util.Scanner;

public class Sumofdigit2{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int num;
    while (n!=0) {
      num=n%10;
      sum+=num;
      n/=10;
      if(n==0&&sum>=10){
        n=sum;
        sum=0;
      }
      
    }
    System.out.println("the sum of four digit number is: "+sum);
  System.out.println(n);
    sc.close();
    }
  }

