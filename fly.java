import java.util.*;
public class fly {
  public static void flyod(int n) {
    int counter=1;
    for(int j=1;j<=n;j++){
        for(int i=1;i<=j;i++){
            System.out.print(counter + " ");
            counter++;
      
        }
        System.out.println();
    
        
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    flyod(n);
    sc.close();
  }
}
