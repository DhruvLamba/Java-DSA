public class lc_34 {
        public int[] searchRange(int[] nums, int target) {     
            int[] ans={-1,-1};
            int start=search(nums,target,true);
            int end=search(nums,target,false);
            ans[0]=start;
            ans[1]=end;
            return ans;
        }
        int search(int[] nums,int target,boolean first){
            int ans=-1;        
            int start=0;       
            int n=nums.length;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;  
    
                }
                else if(nums[mid]>target){
                    end=mid-1;            
                }
                else{                
                    ans=mid;
                    System.out.println(ans);
                    if(first){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            return ans;         
                
                
        }            
            
}
    
        
    
