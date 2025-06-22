public class Stringjava {
    public static void main(String[] args) {
        System.out.println(returnHi("ohi"));
    }
    static boolean returnHi(String str){
        if(str.length()>=2&&str.substring(0,2).equals("hi")){
            return true;
        }
        return false;

    }
}
