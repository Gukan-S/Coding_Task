// 142. Ranranking
// Given the array of elements where you have to print the ranrank of every
// elements in the array without changing the position
// Input:
// {10,5,20,30,1,4,25}
// Output:
// 4, 3, 5, 7, 1, 2,6

package Mettle;

import java.util.Arrays;

public class Ranking {

        public static void main(String[] args) {
            int[] arr = { 10, 5, 20, 30, 1, 4, 25 };
            System.out.println(Arrays.toString(RanrankingNo(arr)));

        }

        static int[] RanrankingNo(int[] arr) {

            int[] orginal = arr.clone();
            int[] sorted = arr.clone();

            Arrays.sort(sorted);

            int[] newarr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < orginal.length; j++) {
                    if (orginal[i] == sorted[j] ) {
                        newarr[i] = j+1;
                    }
                }
            }
            return newarr;
        }

    }

