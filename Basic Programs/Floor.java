public class Floor {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,16,19,22};
        System.out.println(Floor_no(arr,21));

        }
        //return the greater number which is <= target
        static int Floor_no(int[] arr, int target ){
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
            return end;
        }
    }
