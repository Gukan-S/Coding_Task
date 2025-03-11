import java.util.Scanner;

public class CurrencytoTotal {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Hunderd: ");
    int hundred=sc.nextInt(); 
    System.out.print("five Hunderd: ");
    int Five_Hundred=sc.nextInt();
    System.out.print("thousands: ");
    int Thousands=sc.nextInt();
    int valueofhundred=hundred*100;
    int valueoffivehundred=Five_Hundred*500;
    int valueofthousand=Thousands*1000;
    int total=valueofhundred+valueoffivehundred+valueofthousand;
    System.out.println("the total amount is: "+total);
    sc.close();
    }
}
