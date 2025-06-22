import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(ispalindrome(number)==true){
      System.out.println("it is palindrome");
    }
    else{
      System.out.println("it is not palindrome");
    }
    sc.close();
  }
  public static boolean ispalindrome(int number){
    int reverse = 0, temp = number;
        while (temp != 0)
        {
    	    reverse = reverse * 10 + temp % 10;
	        temp = temp / 10;
        }
        if (number == reverse)
            return true;
        else
            return false;
      }  
  
}

// import java.util.*;
// public class NumberPalindrome
// {
//     public static boolean isPalindrome (int number)
//     {
//         int reverse = 0, temp = number;
//         while (temp != 0)
//         {
//     	    reverse = reverse * 10 + temp % 10;
// 	        temp = temp / 10;
//         }
//         if (number == reverse)
//             return true;
//         else
//             return false;
//     }
 
//     public static void main (String[]args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int number = sc.nextInt ();
//         if (isPalindrome (number))
//             System.out.println (number + " is a palindrome number");
//         else
//             System.out.println (number + " is not a palindrome number");
//     }
// }