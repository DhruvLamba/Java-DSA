public class recurbinary {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9,10,44,56};
        int target=9;
        int res=search(arr,target,0,arr.length-1);
        System.out.println(res);
    }
    static int search(int[] arr, int target,int s,int e){
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}
