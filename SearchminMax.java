public class SearchminMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, 6, 3, 14, 28};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            int element=arr[i];
            if (element<min) {
                min = element;

            }
        }
        return min;
    }
}
