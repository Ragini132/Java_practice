class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       // boolean res=false;
        //int count=0;
        HashMap<Integer,Integer> map1=new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
        if(map1.containsKey(nums[i])){
            int pre = map1.get(nums[i]);
            if(i-pre<=k)
                return true;
        }
 
        map1.put(nums[i], i);
    }
 
    return false;
    }
}
