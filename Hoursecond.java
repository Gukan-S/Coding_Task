public class Hoursecond {

  public static void main(String[] args) {
    System.out.println(getDurationString(65, 55));
    System.out.println(getDurationString(3400L));
  }
  private static String getDurationString (long minute,long seconds) {
    if(minute<0|seconds<0||seconds>59){
      return "Invalid";
    }
    long hours=minute/60;
    long remaininmin=minute%60;
    return(+hours+"h "+remaininmin+"m " +seconds+"s");
  }
  private static String getDurationString (long seconds){
      if(seconds<0){
        return "Invalid";
      }
      long minute=seconds/60;
      long remseconds=minute%60;
      return getDurationString(minute, remseconds);
  }
}
