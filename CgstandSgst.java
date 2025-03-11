import java.util.Scanner;

public class CgstandSgst {
  public static void main(String[] args) {
    System.out.println(GetCgsTAndSgst());
  }
static double GetCgsTAndSgst(){
  Scanner sc=new Scanner(System.in);
  double price=sc.nextDouble();
  sc.close();

  double Cgst=9.0/100*price;
  System.out.println(" the Cgst "+Cgst);
  
 double Sgst=11.0/100*price;
 System.out.println("the Sgst "+Sgst);
 double total=price+Cgst+Sgst;
 return  total;

}
}