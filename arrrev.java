public class arrrev{
  public static void rev(int num[]) {
    int last=num.length-1, first=0;    
    for(int i=0;i<num.length;i++){
      if(first<last){
        int temp=num[last];
        num[last]=num[first];
        num[first]=temp;
         first++;
         last--;        
      }   
    }
    for(int i=0;i<num.length;i++){
      System.out.print(num[i]+ " ");
    }
      
  }
   
  public static void main(String[] args) {
    int num[]={1,5,3,9,4};
    rev(num);
     
    
  }
}
