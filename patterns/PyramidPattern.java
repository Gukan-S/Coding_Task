package patterns;

public class PyramidPattern {
    public static void main(String[] args) {
        int n=8;
        Daimond1(n);
    }
    static void Daimond1(int n) {
        for (int i = 1; i <n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <n; k++) {
                System.out.print("* ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void Daimond2(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print("* ");
            }
            for(int k=i;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <i; k++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
