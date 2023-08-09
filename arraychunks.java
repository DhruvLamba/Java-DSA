import java.util.*;
public class arraychunks{  
  public static void main(String[] args) {
    int nums[]={2,3,4,5,6,7,8,9};
    int n=nums.length;
    int size=4;
    for(int i=0;i<n;i=i+size){
      for(int j=i;j<size;j++){
        System.out.print(nums[j]+ " ");
      }
    }
  }
}