class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> m1=new HashMap<Integer, Integer>();
            int arr[]=new int[nums2.length];

        
            for(int i=0;i<nums1.length;i++){
                if(m1.containsKey(nums1[i])){
                    m1.put(nums1[i],m1.get(nums1[i])+1);   
                }
                else{
                    m1.put(nums1[i], 1);
                }
            }
            int p=0;
        for(int j=0;j<nums2.length;j++){
            if(m1.containsKey(nums2[j])){
                arr[p]=nums2[j];
                p++;
            }
        }
        return arr;
    }
}
