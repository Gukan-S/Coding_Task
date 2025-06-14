

class UniqueDigit {
  public static void main(String[] args) {
    int n=292;
    int count=0;
    for(int i=0;i<n;i++){
      int r=n%10;
      count++;
      n/=10;
    }
    System.out.println(count);
  }
  
}