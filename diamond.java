public class diamond {
  public static void dim(int n) {
    int counter=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=counter;j++){
        System.out.print("*");
      }
      if(i==n){
        continue;
      }else{
        counter=counter+2;
      }
      
      System.out.println();
      
    }  
    System.out.println();   
    for(int i=n;i>=1;i--){
        for(int j=1;j<=(n-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=counter;j++){
          System.out.print("*");
        }
        counter=counter-2;
        System.out.println();
      }
  }

   
  public static void main(String[] args) {
    dim(5);
  }
}
