import java.util.Scanner;

public class Kgtogm{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the weight");
    double n=sc.nextDouble();
    convert(n);
    sc.close();
}
public static void convert(double kgs){
    double weightgms,weightmgs;
    weightgms=kgs*1000;
    weightmgs=weightgms*1000;
    System.out.println("the kilo in grams:"+weightgms);
    System.out.println("the kilo in mile grams:"+weightmgs);
}
        }