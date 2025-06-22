public class Printfactor {
  public static void main(String[] args) {
System.err.println(printfact(8));
  }
  public static String printfact(int n){
    if (n<1) {
      return "Invalid";
    }
    for(int i=1;i<=n;i++){
      if (n%i==0) {
        System.out.print(i+"");
      }
    }
    return "";
  }
}
