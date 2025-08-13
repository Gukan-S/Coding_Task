//Find the matching string and print it in Capitalcase
//Input:"apple banana mango apple grape"
//Matching word: "apple"
//Output:"Apple banana mango Apple grape"

        package Mettle;

import java.util.Arrays;

public class MatchingStringCap {
    public static void main(String[] args) {
        String str="apple banana mango apple grape";
        String target="Mango";
        String[] words=str.split("\\s+");
        for (int i=0;i< words.length;i++){
            if(words[i].equalsIgnoreCase(target)){
                words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1,words[i].length());
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
