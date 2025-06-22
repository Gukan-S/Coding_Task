//42.
//        1
//        0 0
//        1 1 1
//        0 0 0 0
//        1 1 1 1 1



package patterns;

public class Pattern0or1 {
    public static void main(String[] args) {
        int n=5;
        Pattern0or12(n);
    }
    static void Pattern0or11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i%2==0)?0:1);
            }
            System.out.println("");
        }
    }
    static void Pattern0or12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((j%2==0)?0:1);
            }
            System.out.println("");
        }
    }
}
