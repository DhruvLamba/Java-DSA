public class countrotation {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5};
        int count=pivot(arr)+1;
        System.out.println(count);
    }
    public static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }  
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
}


