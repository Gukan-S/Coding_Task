public class Paintjob {
public static void main(String[] args) {
  System.out.println(getbucketcount(3.4, 2.1, 1.5, 2));
  System.out.println(getbucketcount(-3.4, 2.1, 1.5, 2));
}  
public static double getbucketcount(double width,double height,double areaperbucket,int count){
  if (width<0||height<0||areaperbucket<0||count<0) {
    return -1;
  }
  else{
    double area=(width*height);
    double bucket=area/areaperbucket;
    double remain=bucket-count;
    return Math.round(remain);
}
}}


