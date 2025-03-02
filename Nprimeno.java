import java.util.Scanner;

public class Nprimeno {
  public static void main(String[] args) {
    Scanner mouse=new Scanner(System.in);
    int n=mouse.nextInt();
    for(int i=1;i<=n;i++){
     isprime(i);
    }
    mouse.close();
  }
  public static void isprime(int n) {
    int count=0;
    for(int j=1;j<=n;j++){
      if(n%j==0)
        count+=1;
      
    }
    if(count==2)
    System.out.println(n+" is prime no");
    
  }
                          }

