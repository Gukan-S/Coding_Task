import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,45,32,67,89,9,12};
        int ans=LSearch(arr,67);
        String str="Gukan";
        char ch='k';

//        System.out.println(ans);
//        System.out.println(LSearch2(arr,67));
//        System.out.println(LSearch3(arr,67));
        System.out.println(StringSearch(str,ch));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static int LSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int LSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i< arr.length;i++){
            int element=arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    static boolean LSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int i=0;i< arr.length;i++){
            int element=arr[i];
            if(element==target){
                return true;
            }
        }
        return false;
    }
    static boolean StringSearch(String str,char ch){
        if(str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
