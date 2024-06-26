public class maxsub{
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    max=max(sum,max);
                }
            }
        }
        System.out.println(max);
    }
    private static int max(int sum, int max) {        
        if(sum>max){
            return sum;
        }
        return max;
       
    }
}