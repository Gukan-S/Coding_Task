//Check if 2 Arrays are equal or not.
// Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
//Output: true

package Mettle;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        System.out.println(Isequal(a,b));

    }

    static boolean Isequal(int[] a, int[] b) {
        boolean not = true;
        if (a.length != b.length) {
            not = false;
        } else {
            int i=0;
            int j=0;
            while (i<a.length){
                not=false;
                while (j<b.length){

                    if(a[i]==b[j])
                      not=true;
                    j++;
                }
                i++;
                j=0;
                if(!not){
                    return false;
                }
            }
        }
        return not;
    }
}

