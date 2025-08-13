//Total Number of Words in a given string

package Mettle;

public class TotalNoWord {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(CountWord2(str));
    }
    static int CountWord(String str){
        int count=0;

        str=str.trim();
        if (str.length() == 0) {
            count=0;
        }
        count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
       return count;
    }
    static int CountWord2(String str){
        str=str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+"); // split by one or more whitespace
        return words.length;
    }
    }

