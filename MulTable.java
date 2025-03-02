import java.util.Scanner;

public class multable {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      int table=i*n;
      System.out.println(i+" * "+n+" = "+table);
    }
    sc.close();
  }
}
