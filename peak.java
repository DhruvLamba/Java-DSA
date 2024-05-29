class Solution {   
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5,4,3,2,1};
        int peek=findPeakElement(arr);
        System.out.println(peek);
    }
 

    public static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        System.gc();
        return start;
    }
}