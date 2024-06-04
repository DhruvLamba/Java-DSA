public class Solution{
    public int guessNumber(int n) { 
        long low=1;
        
        long high=n;
        int count=0;
        long mid=0;
        mid=low+(high-low)/2;
        System.out.println("MID:- "+mid);
        while(mid>=0 && low<=high){
            System.out.println("LOW:- "+low);
            System.out.println("HIGH:- "+high);
            mid=(low+high)/2;
            System.out.println("MID:- "+mid);
            int result=guess((int)mid);
             System.out.println("RESULT:- "+result);
            if(result==-1){
                high=mid-1;
                // System.out.println("HIGH:- "+high);
            }else if(result==1){
                low=mid+1;
                // System.out.println("LOW:- "+low);
            }else{
                return (int)mid;
            }

        }
       
        return 1;

        
    }
}