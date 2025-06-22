public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingno(arr));

    }
    static int missingno(int[] arr){
//        Arrays.sort(arr);
        int i=0;
        while(i<arr.length){
            int current =arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[current]){
                swap(arr,i,current);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
       return -1;
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
