//Program to count the characters which has lower followed by higher
//        Input="accept Van"
//Output=2


package Mettle;

public class AfterUppercaseCount {
    public static void main(String[] args) {
        String str = "accept Van";
        String[] words = str.split("\\s+");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    int count = word.length() - (i + 1);
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
