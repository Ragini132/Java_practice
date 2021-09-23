class Solution {
    public int firstUniqChar(String s) {
        // non-repeating char present
        int index=-1;
        HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i), 1);
            }
        }
        int j=0;
        for(j=0;j<s.length();j++){
            if(map1.get(s.charAt(j))==1){
                index=j;
                break;
            }
        }
        if(j==s.length()-1 && index==-1){
            return index;
        }
        else
            return index;

        
        // all repeating char present
        
    }
}
