public class pyramid {
  public static void pyr(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    pyr(5);
  }
  
}
