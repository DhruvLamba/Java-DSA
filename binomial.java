import java.util.Scanner;
public class binomial {
  public static int bino(int n,int r,int c ) {
    int one=1,two=1,three=1;
    for(int i=1;i<=n;i++){
         one= one * i;
    }
    for(int i=1;i<=r;i++){
         two = two*i;
    }

    for(int i=1;i<=c;i++){
       three= three*i;
    }

    
    int res = one/(two*three);
  
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int c = n-r;
    int result = bino(n,r,c);
    System.out.println(result);
    sc.close();
  }
  
}
