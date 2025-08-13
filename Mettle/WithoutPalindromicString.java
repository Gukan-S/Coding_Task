//Program to remove the palindromic string from the given input string
// "In India Malayalam is best with dad and mom"
//Output: "In India is best with and"
package Mettle;

public class WithoutPalindromicString {
    public static void main(String[] args) {
        String str="In India Malayalam is best with dad and mom";
        String result="";
        String[] str2=str.split("\\s+");
        for(String words:str2) {
            if (!isPalindrome(words)) {
                result += words+" ";
            }
        }
        System.out.println(result.trim());
    }
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
