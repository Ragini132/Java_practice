class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        
        
        int i = 0;
        for(int j = 0; i < s.length() && j < t.length(); ++j){
            if(arr1[i] == arr2[j]){
                ++i;
            }
        }
        return i == s.length();
    }
}
