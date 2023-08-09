public class maxsum{
  public static void maxsum1(int num[]) {
    int largest=Integer.MIN_VALUE,large;
    for(int i=0;i<num.length;i++){
        for(int j=i;j<num.length;j++){
          large=0;
          for(int k=i;k<=j;k++){
            large+=num[k];   
            
          }
          System.out.println(large);
          if(largest<large){
              largest=large;
            } 
          
          

        }
          
    }
    System.out.println("Max sum is " + largest);
        
  }
      
  
  public static void main(String[] args) {
    int num[]={1,-2,6,-1,3};
    maxsum1(num);    
  }
  
}
