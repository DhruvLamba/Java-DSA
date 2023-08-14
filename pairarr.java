public class pairarr {
  public static void pair(int num[]) {
    for (int i=0;i<num.length;i++){
      for(int j=i+1;j<num.length;j++){
        System.out.print("[" + num[i] + " ," + num[j] + "]");
      }
      System.out.println("");
    }
  }
    
  
  public static void main(String[] args) {
    int num[]={2,3,4,6,7};
    pair(num);
  }
  
}
