public class Calculateside {
  public static void main(String[] args) {
    double circle=area(5.5);
    double rect=area(4.0, 7.9);
    System.out.println("area of circle is; "+circle);
    System.out.println("area of the rectangle is: "+rect);
  }
  public static double area(double x,double y){
    if(x<0.0 || y<0.0){
      return -1.0;
     
    }
    return x*y;
  }
    public static double area(double radius){
      if(radius<0){
        return -1.0;
  }
  return radius*radius*Math.PI;
}
  }