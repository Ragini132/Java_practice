class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> h1=new HashMap<Integer, Integer>();
        int[] res=new int[2];
        //adding nums to hashmap
        for(int i=0;i<nums.length;i++){
            
            if(h1.containsKey(nums[i])){
                
               res[0]=i;
            res[1]=h1.get(nums[i]);;
                
            }
            else{
                h1.put(target - nums[i], i);
            }
            
            
           // h1.add(nums[i],0);
        }
        
        return res;
        
    }
}
