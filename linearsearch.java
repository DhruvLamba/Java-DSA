import java.util.*;
public class linearsearch {
  public static void linear(int arr[],int n) {
    for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
          System.out.println("Found"+ " " + "at index:" + " " + i);
        }
    }
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={2,4,3,9,10,12};
    int n=sc.nextInt();
    linear(arr, n);
    
  }
    


}
        
