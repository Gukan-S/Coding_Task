public class Numcheck {
  public static void main(String[] args) {
    printequal(1, 1, 1);
    printequal(1, 2, 1);
    printequal(-1, -1, -1);
  }
  public static void printequal(int a,int b,int c) {
    if(a<0||b<0||c<0){
      System.out.println("Invalid Value");
    }
    else if(a==b&&b==c&&c==a){
      System.out.println("all are Equal");

    }
    else if(a!=b&&b!=c&&c!=a){
      System.out.println("all are equal");
    }
    else{
      System.out.println("Neither all are equal");
  }
  
  }
}
