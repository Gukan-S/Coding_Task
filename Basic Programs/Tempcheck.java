public class Tempcheck {
  public static void main(String[] args) {
    System.out.println(iscatplaying(true,10));
    System.out.println(iscatplaying(false, 36));
    System.out.println(iscatplaying(false, 35));
  }

  public static boolean iscatplaying(boolean summer,int temprature) {
    if(summer==true){
    if(temprature>=25&&temprature<=45){
      return true;
    }
    else
    return false;
  }
  if (temprature>=25&&temprature<=35) {
    return true;
  }
  else{
   return false;
  }
}
}

