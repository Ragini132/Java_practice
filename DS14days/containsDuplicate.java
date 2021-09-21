class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag=0;
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                flag=1;
                break;
            }
            else{
                map1.put(nums[i],1);
            }
        }
        if(flag==1){
            return true;
        }
        else{
            
            return false;
        }
    }
}
