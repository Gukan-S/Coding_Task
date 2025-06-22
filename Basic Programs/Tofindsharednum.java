public class Tofindsharednum {

  public static void main(String[] args) {
    System.out.println(sharednum(12, 23));
    System.out.println(sharednum(9,99));
    System.out.println(sharednum(15, 55));
  }
  public static boolean sharednum(int num1,int num2){
    if(num1<10||num1>99||num2<10||num2>99)
    return false;
    
    int digit1a=num1/10;
    int digit1b=num1%10;
        int digit2a=num2/10;
        int digit2b=num2%10;
        if (digit1a==digit2a||digit1a==digit2a||digit1b==digit2a||digit1b==digit2b){
          return true;
        }
        else{
          return false;
        }
      }
    }
 