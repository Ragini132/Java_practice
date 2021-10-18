class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int f=0;
        int l=n-1;
        int res=binary(nums, f, l, target);
        return res;
        
    }
    
    public int binary(int[] nums, int f, int l, int target){
        if(l>=f){
            int mid=l+(f-1)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return binary(nums, f, mid-1, target);
            }
            else
                return binary(nums, mid+1, l, target);
        }
        return -1;
    }
    
}
