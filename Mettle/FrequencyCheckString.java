//Program to print the frequency count from highest to lowest
//I/p: “repeatable”
//O/p: e:3
//a:2
//r:1
//p:1
//t:1
//b:1
//l:1

package Mettle;

public class FrequencyCheckString {
    public static void main(String[] args) {
         String str="repeatable";
         str=str.toLowerCase();
         int[] freq=new int[26];
         for(char ch:str.toCharArray()){
             freq[ch-'a']++;

         }
         for(int i=0;i< freq.length;i++){
             if(freq[i]>0){
                 System.out.println((char)(i+ 'a')+(":"+freq[i]));
             }
         }
    }
}
