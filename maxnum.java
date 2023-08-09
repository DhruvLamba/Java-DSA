public class maxnum {
  public static int max(int num[]) {
    int max=Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        if(num[i]>max){
          max=num[i];
        }
        
    }
    return max;
    
  }
  public static void main(String[] args) {
    int num[]={2,4,1,10,3};
    int maximum=max(num);
    System.out.print(maximum);
  }
  
}
