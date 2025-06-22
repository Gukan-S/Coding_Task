//45.
//no=5
//        12345
//        1234
//        123
//        12
//        1

        package patterns;

public class PatternDigit {
    public static void main(String[] args) {
        int n = 5;
        PatternDigit3(n);
    }
    static void PatternDigit1(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
//    47.
//    no=5
//            12345
//            2345
//            345
//            45
//            5

    static void PatternDigit2(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
//    no=5
//            5 4 3 2 1
//            4 3 2 1
//            3 2 1
//            2 1
//            1

    static void PatternDigit3(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
