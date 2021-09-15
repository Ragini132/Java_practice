class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean res=false;
        int count=0;
        HashMap<Integer,Integer> map1=new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                int left=map1.get(nums[i]);
                int right=i;
                if(k>=Math.abs(right-left)){
                 res= true;

                }
                else{
                    res= false;
                    map1.put(nums[i],i);
                    
                }        
            }
            else{
                map1.put(nums[i],i);
                count++;
            }      
        }
        if(count==nums.length){
            return false;
        }
        else{
        return res;
        }
    }
}
