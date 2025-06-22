public class Tofindwealth {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{1,2,3}};
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int[][] accounts) {
        int accsum=0;
        int max=0;
        for(int person=0;person<accounts.length;person++){
            for(int account=0;account<accounts[person].length;account++){
                accsum+=accounts[person][account];
            }
            if(accsum>max){
                max=accsum;
            }

        }
        return max;
    }
}
