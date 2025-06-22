public class Yearsandminutes {
  public static void main(String[] args) {
   Yearsanddays(525600);
   Yearsanddays(1051200);
   Yearsanddays(561600); 
  }
  public static void Yearsanddays(long minutes) {
    if(minutes<0){
      System.out.println("Invalid");
    }
    else{
      long year=minutes/525600;
      long minutesremain=(minutes-(year*525600));
      long days=minutesremain/1440;
      System.out.println(minutes+" min = "+year+" y and "+days+" d");
    }
  }
}
