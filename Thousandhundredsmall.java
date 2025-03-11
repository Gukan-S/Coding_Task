public class Thousandhundredsmall  {
  public static void main(String[] args) {
      int a = 3541,b = 2452,c = 3512 , d,e;
      int g=10 ;
      d = a / 1000;
      e = (b / 100) % 10;
//        g=Math.min(c);
      while (c!=0){
          g=g<(c%10)?g:(c%10);
          c/=10;
          if(c==0)
              break;
          }
      System.out.println(d);
      System.out.println(e);
      System.out.println(g);
      System.out.println((d*e)+g);
  } 
  
}
