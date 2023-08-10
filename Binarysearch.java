import java.util.*;
public class Binarysearch {
  public static int binary(int num[],int n) {
    int start=0,end=num.length-1;
    while(start<=end){
      int mid=(start+end)/2;
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
  return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int num[]={1,2,3,4,5,12,14};
       
    System.out.println("element is at index" + " " + binary(num,n));

    
  }
  
}
