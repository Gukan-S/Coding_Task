package patterns;

public class HallowSquare {
    public static void main(String[] args) {
        int n = 5;
        HallowDaimond(n);
    }
        static void HallowSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(i==1||i==n){
                    System.out.print("1 ");
                }
                else if(j==1){
                    System.out.print(i+" ");
                }
//
                else if(j == n ){
                    System.out.print("5 ");
                }
                else {
                    System.out.print("  ");
                }
//
            }
            System.out.println("");

        }
    }
    static void HallowDaimond(int n){

                int size = 2 * n - 1; // total rows and columns

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {

                        int distance = Math.abs(i - (n - 1)) + Math.abs(j - (n - 1));

                        if (distance < n) {

                            System.out.print("  ");
                        } else {

                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
            }
        }
