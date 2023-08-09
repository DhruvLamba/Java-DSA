import java.util.*;
public class Sum {
  public static void main(String[] args){
      int sum=0;
      int counter=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the range");
      int n= sc.nextInt();
      while(counter<n){
        sum=sum+1;
        counter++;
        System.out.print(sum+",");        

      }
      System.out.println("");
      System.out.println("The sum is" + sum);
  }
  
}
