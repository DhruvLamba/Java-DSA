import java.util.Scanner;
public class factorial {
  public static int fact(int n,int r,int c ) {
    if(n==0 || n==1){
        return 1;

    }   
    int res=1;
    for(int i=1;i<=n;i++){
        res= res*i;
    }
  
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int c = n-r;
    int result = fact(n,r,c);
    System.out.println(result);
  }
  
}
