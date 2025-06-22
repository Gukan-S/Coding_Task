public class Kilostoflour {
  public static void main(String[] args) {
    System.out.println(kilotoflour(1, 0, 4));
    System.out.println(kilotoflour(1, 0, 5));
    System.out.println(kilotoflour(0, 5, 4));
  }
  public static boolean kilotoflour(int big,int small,int goal){
    if (big<0||small<0||goal<0) {
      return false;
    }
    if (goal>(big*5+small)) {
      return false;
    }
    else{
      if ((goal%5)<=small) {
        return true;
      }
    }
        return false;
  
  }
}
