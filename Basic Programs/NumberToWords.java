import java.util.*;
class NumberToWords
{
    public static void numberToWords (int num)
    {
        if (num < 0)
        {
        	System.out.println ("-1");
	        return;
        }
        int temp = num;
        ArrayList < String > list = new ArrayList < String > ();
        String arr[] ={ "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine" };
        while (temp != 0)
        {
    	    list.add (arr[temp % 10]);
	        temp = temp / 10;
        }
    
        for (int i = list.size () - 1; i >= 0; i--)
            System.out.print (list.get (i) + " ");
        System.out.println ();
    }
    public static void main (String[]args)
    {
        numberToWords (123);
        numberToWords (3456);
        numberToWords (-7);
    }
}
