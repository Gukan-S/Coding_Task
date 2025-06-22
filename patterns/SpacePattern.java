//no=5
//        1
//        12
//        123
//        1234
//        12345
package patterns;

public class SpacePattern {
    public static void main(String[] args) {
        int n = 5;
        SpacePattern2(n);
    }
    static void SpacePattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

//46.
//    no=5
//            12345
//            2345
//            345
//            45
//            5
    static void SpacePattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
