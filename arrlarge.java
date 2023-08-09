public class arrlarge{
  public static int large1(int num[]) {
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
      if(largest<num[i]){
        largest=num[i];
      }      
   }
    return largest;
  }
  public static void main(String[] args) {
    int num[]={1,5,3,9,4};
    int large1=large1(num);
    System.out.println(large1);
  }
}
