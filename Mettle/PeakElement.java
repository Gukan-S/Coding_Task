public class PeakElement {
    public static void main(String[] args) {
        int[] nums={0,2,1,0};
        System.out.println(findPeakElement(nums));
    }
        static int findPeakElement(int[] nums) {
            int max=0;
            for(int i =0;i<nums.length-1;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }
    }
