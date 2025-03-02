public class Dimesionofthefigure {
  public static void main(String[] args) {
    int length=6;
    int breath=5;
    double height=10.5;
    double radius=4.5;
    dimension(breath);
    dimension(length, breath);
    dimension(height, breath);
    dimension(radius);
  }
  public static void dimension(int sdimension){
    int square=sdimension*sdimension;
    System.out.println(square);
  }
  public static void dimension(int height,int breath){
    int rectangle=breath*height;
    System.out.println(rectangle);
}
public static void dimension(double height,int breath){
  double Triangle = (1%2.0) * (breath * height);
  System.out.println(Triangle);
}
public static void dimension(double radius){
  double π=3.14;
  double circle =π*(radius*radius);
  System.out.println(circle);

}
}
