public class SteppingNo {
    public static void main(String[] args) {
        int n=1235;
        String str=Integer.toString(n);
        boolean step=true;
        for(int i=0;i<str.length()-1;i++){
            int current=str.charAt(i)-'0';
            int next=str.charAt(i+1)-'0';
            if(current-next!=-1&&current+next!=1){
                step=false;
                break;
            }
        }
        System.out.println(step);
    }
}
