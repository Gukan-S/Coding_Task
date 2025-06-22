import java.util.Arrays;

public class fFirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,7,10};
        int target = 7;
        System.out.println("Output: " + Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int s=search(nums, target,true);
        int e=search(nums, target,false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    static int search(int[]nums,int target,boolean firstpo){
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>nums[mid]){
                s=mid+1;
            }
            else if(target<nums[mid]) {
                e=mid-1;
            }
            else{
                ans=mid;
                if(firstpo){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}

