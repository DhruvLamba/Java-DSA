public class one {
  public static void patt(int n) {
    int counter=1;
      for(int j=1;j<n;j++){
        for(int i=1;i<=j;i++){
          if((i+j)%2==0){
            counter=1;
          }else{
            counter=0;
          }
          System.out.print(counter);
          
        }
        System.out.println();
      }
    
  }
  public static void main(String[] args) {
    patt(6);
  }
  
}
