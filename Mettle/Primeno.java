public class Primeno {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(noprime(num));

        }
        static int noprime(int n){
        int count=0,ans=0,i=2;
        while (n!=0){
            if(Isprime(i)) {
                count++;
                ans = i;
            }

            if(count==n){
                return ans;
            }
            i++;
            }
            return 0;
        }


        static boolean Isprime(int num){
            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

