class sortrecursion{
    public static void main(String args[]){
        int[] arr={1,3,6,9,12,13};       
        boolean res=search(arr,0);
        System.out.println(res);
    }
    static boolean search(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }        
        return arr[index]<arr[index+1] && search(arr,index+1);
    }
}