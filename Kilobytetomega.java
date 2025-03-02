import java.util.*;
public class Kilobytetomega{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the kilobyte value:");
    int kiloByte=sc.nextInt();
    kilotomega(kiloByte);
    sc.close();
  }
  public static void kilotomega(int kiloByte) {
    if(kiloByte<0){
      System.out.println("Invalid");
    }
    else{
      int Megabyte=kiloByte/1024;
      int kiloremainder=kiloByte%1024;
      System.out.println(" MB is "+Megabyte+" KB is "+kiloremainder);
    }
  }
}