public class linearrecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,10};
        int target=18;
        boolean res=search(arr,target,0);
        System.out.println(res);
    }
    static boolean search(int[] arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
        return (arr[index]==target) || search(arr, target, index+1);
    }
}
