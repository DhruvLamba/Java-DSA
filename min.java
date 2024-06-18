// Using Brute Force
// public class min {
//     public static void main(String[] args) {
//         int[] nums1={1,2,3};
//         int[] nums2={2,4};
//         int n=nums1.length;
//         int flag=0;
//         int n1=nums2.length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n1;j++){
//                 if(nums1[i]==nums2[j]){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==1){
//                 System.out.println(nums1[i]);
//                 break;
//             }
           

//         }
//     }
// }

// Using Binary Search
public class min{
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4};
        int res;
        for(int i=0;i<nums1.length;i++){            
            res=search(nums2,nums1[i]);            
            if(res!=-1){
                System.out.println(res);
                break;
            }
        }        
    }
    static int search(int[] nums2,int target){
        int start=0;
        int end=nums2.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums2[mid]==target){                
                return target;
            }
            else if(nums2[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}