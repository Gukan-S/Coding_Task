//Highest frequency character in aString
//Input: engineering
//Output: e 3

package Mettle;

public class FrequencyLetter {
    public static void main(String[] args) {
        String str = "engineeriniiiig";
        System.out.println(Frequency(str));
    }

    static String Frequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i <str.length() ; i++) {
            freq[str.charAt(i)]++;
        }
        int maxElement=0;
        char frequency=' ';
        for (int i = 0; i <str.length() ; i++) {
            if(freq[str.charAt(i)]>maxElement){
                maxElement=freq[str.charAt(i)];
                frequency= str.charAt(i);
            }
        }
        String ans=frequency+" : "+maxElement;
            return ans;
        }
    }

