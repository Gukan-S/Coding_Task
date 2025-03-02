public class Multitable {
  public static void main(String[] args) {
    int n=5;
    mutipication(n);
  }
  public static void mutipication(int n){
    int table;
    int i=1;
    while (i<=10) {
      table=i*n;
      System.out.println(table);
      i++;
    }
  }
}
