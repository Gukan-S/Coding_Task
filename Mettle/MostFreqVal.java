//. You are given an array arr, and your task is to find the majority element an element
//that occurs more than half the length of the array (i.e., arr.size() / 2). If such an
//element exists return it, otherwise return -1, indicating that no majority element is
//present.
//        Input : arr[] = [1, 1, 2, 1, 3, 5, 1]
//Output : 1


        package Mettle;

public class MostFreqVal {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 2, 3, 3, 3};
        int max= arr.length/2;
        System.out.println(MoreThanLen(arr,max));
    }
    static int MoreThanLen(int[] arr,int max ){
        int count=0;
        int ans=0;

        for(int i=0;i< arr.length;i++){
            count=0;
            boolean visit=false;
            for (int j = 0; j < i ; j++) {
                if(arr[i]==arr[j]){
                    visit=true;
                    break;
                }
            }
            if(visit) continue;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
            }
        }
            if(count>max){
                ans=arr[i];
            }
            else {
                ans=-1;
            }

        }
    return ans;
    }
}
