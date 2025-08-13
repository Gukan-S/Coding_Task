//. Frequency count with descending order printing
//        int a[] = { 50, 20, 150, 20, 50, 10, 30, 10, 10 };

package Mettle;

import java.util.HashMap;
import java.util.Map;

public class DecreasingCount {

        public static void main(String[] args) {
            int[] arr = { 50, 20, 150, 20, 50, 10, 30, 10, 10 };

            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int num : arr) {

                if (freqMap.containsKey(num)) {
                    freqMap.put(num, freqMap.get(num) + 1);
                } else {

                    freqMap.put(num, 1);
                }
            }

            System.out.println("Element : Frequency");
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }


