public class Maxin2dArray {
        public static void main(String[] args) {
            int[][] arr={{1,2,3},
                    {9,18,5},{6,7,14}};
            System.out.println(Maxarry(arr));

        }

    static int Maxarry(int[][] arr ){
        int max= 0;
        for(int row=0;row< arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                int element=arr[row][col];
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }

}

