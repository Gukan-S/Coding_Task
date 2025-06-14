public class Celling {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,14,15,17,19};
        System.out.println(Celling_no(arr,18));
    }
    //return the smallest number which is >= target
    static int Celling_no(int[] arr, int target ){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return start;
    }
}
