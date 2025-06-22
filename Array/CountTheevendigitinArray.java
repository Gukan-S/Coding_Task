public class CountTheevendigitinArray {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(Findno(nums));
    }

//    static int Findno(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if (iseven(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    static boolean iseven(int num) {
//        int Noofdigits = countdigit(num);
//
//        return Noofdigits % 2 == 0;
//    }
//
//    static int countdigit(int num) {
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num /= 10;
//        }
//        return count;
//    }

static int countdigit(int num){
    int count=0;
    while (num>0){
        count++;
        num/=10;
    }
    return count;
}
    static int Findno(int[] nums){
        int count=0;
 for(int num:nums){
            if(countdigit(num)%2==0){
                count++;
            }
        }
        return count;
    }
}

