
//
//Reverse odd position based on the input
//Input:"I love programming in python language"
//Position to reverse: "odd"
//Output: "I evol programming ni python egaugnal"

        package Mettle;

public class StringOddReverse {
    public static void main(String[] args) {
        String str="I love programming in python language";
        String op="odd";
        String ans="";
        String[] words=str.split("\\s+");
        for(int i=0;i<words.length;i++){
            if(op.equals("odd") && i%2!=0){
                    for (int j = words[i].length()-1; j >=0 ; j--) {
                        ans+=words[i].charAt(j);

                }
                    ans+=" ";
                }
            else {
                ans+=words[i]+" ";
            }


        }
        System.out.println(ans);
//        System.out.println(StringBuild(str,op));
    }
    static String StringBuild(String str,String op){
        String ans="";
        String[] words=str.split("\\s+");
        for(int i=0;i<words.length;i++){
            if(op.equals("odd") && i%2!=0){
                StringBuilder sb = new StringBuilder(words[i]);
                ans += sb.reverse().toString() + " ";
            }
            else {
                ans+=words[i]+" ";
            }


        }
        return ans;
    }
    }

