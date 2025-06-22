public class CircularSubarray {
    public static void main(String[] args) {
        int[] nums={1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int currentmax=nums[0];
        int max=nums[0];
        int currentmin=nums[0];
        int min=nums[0];
        int total=0;

        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            max=Math.max(max,currentmax);
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            min=Math.min(min,currentmin);

        }
        if(max<0){
            return max;
        }

        return Math.max(max,total-min);
    }
}

