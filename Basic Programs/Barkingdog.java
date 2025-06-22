
public class Barkingdog {
  public static void main(String[] args) {
    boolean dog=Shouldwakeup(true, 4);
    System.out.println(dog);
  }
  public static boolean Shouldwakeup(boolean barking,int hourOfday) {
    if (hourOfday>0&&hourOfday<=23) {
      if ((barking==true)&&(hourOfday<=8||hourOfday>=22)) {
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
}
