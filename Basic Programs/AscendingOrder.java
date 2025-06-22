public class AscendingOrder {
    public static void main(String[] args) {
        int n=45687;
        String str= Integer.toString(n);
        boolean asc=true;
        for(int i=0;i<str.length()-1;i++){
            int digit=str.charAt(i)-'0';
            int digit2=str.charAt(i+1)-'0';
            if(digit>=digit2) {
                asc=false;
                break;
            }
            }
        System.out.println(asc);
        }
    }

