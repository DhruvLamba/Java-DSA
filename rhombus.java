public class rhombus {
  public static void rho(int n) {

    for (int i=1;i<=n;i++){
        for(int j=0; j<(n-i);j++){
          System.out.print(" ");
        }
        for(int j=0;j<5;j++){
          System.out.print("*");
        }
        System.out.println();
    }

  }
  public static void main(String[] args) {
    rho(5);
  }
  
}
