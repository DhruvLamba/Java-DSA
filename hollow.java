public class hollow {

   public static void hol(int n) {

    for (int i=1;i<=n;i++){
        for(int j=1; j<=(n-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
          if(j==1 || j==5 || i==1 || i==n){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
                 
        }
        System.out.println();
    }

  }

 
 
  public static void main(String[] args) {
    hol(5);
  }
  
}
