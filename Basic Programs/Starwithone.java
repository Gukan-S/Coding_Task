import java.util.*;
public class Starwithone {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the value: ");
  int n=sc.nextInt();
  for(int i=1; i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    for(int k=n-1;k>=i;k--){
      System.out.print("1");
    }
    System.out.println();
  }
  sc.close();
 } 
}