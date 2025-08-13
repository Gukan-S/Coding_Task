//String Encoding
//Input: aaaabbcccc
//Output:a4b2c4

package Mettle;

public class StringEncode {
    public static void main(String[] args) {


        int count = 1;
        String str = "aaaabbcccc";
        String result = "";
        boolean[] visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j]=true;
                }

            }
            result += str.charAt(i) + String.valueOf(count);
            count = 1;

        }
        System.out.println(result);
    }
}
