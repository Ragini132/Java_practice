class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count=0;
        HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
        // storing data in hashmap
        for(int i=0;i<magazine.length();i++){
            if(map1.containsKey(magazine.charAt(i))){
                map1.put(magazine.charAt(i), map1.get(magazine.charAt(i))+1);
            }
            else{
                map1.put(magazine.charAt(i), 1);
            }
        }
        // removing data from hashmap
        for(int j=0;j<ransomNote.length();j++){
            if(map1.containsKey(ransomNote.charAt(j))){
                // only one entry
                if(map1.get(ransomNote.charAt(j))==1){
                    map1.remove(ransomNote.charAt(j));
                    count++;
                }
                else{
                    map1.put(ransomNote.charAt(j),map1.get(ransomNote.charAt(j))-1);
                    count++;
                }    
            }
        }
        if(count==ransomNote.length()){
            return true;
        }
        else{
            return false;
        }
        
    }
}
