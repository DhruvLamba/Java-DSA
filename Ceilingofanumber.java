import java.util.*;
public class Ceilingofanumber {
  public static int binary(int num[],int n) {
    int start=0,end=num.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(num[mid]==n){
        return mid;
      }
      if(num[mid]<n){
        start=mid+1;
       

      }
      if(num[mid]>n){
        end=mid-1;
        
      }
    }
  return start;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int num[]={5,6,7,8,9,15,18};
       
    System.out.println(num[binary(num,n)]);

    
  }
  
}
