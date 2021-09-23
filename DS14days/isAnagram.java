class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
        //code
        HashMap<Character, Integer> map1=new  HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i), 1);
            }
        }
        
        for(int j=0;j<t.length();j++){
            if(map1.containsKey(t.charAt(j))){
                // only one entry
                if(map1.get(t.charAt(j))==1){
                    map1.remove(t.charAt(j));
                }
                else{
                    map1.put(t.charAt(j), map1.get(t.charAt(j))-1);
                }    
            }
        }
            
        if(map1.size()==0){
            return true;
        }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
        // check hashmap size
        
    }
}
