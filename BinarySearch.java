public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-12,-8,-5,0,2,4,7,9,45,67,98,100};
        System.out.println( BinarySeach(arr,0));
    }
    static int BinarySeach(int[] arr, int target ){
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
        return -1;
    }
}
