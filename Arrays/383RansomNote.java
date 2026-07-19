class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mag = new HashMap<>();
        HashMap<Character,Integer>ran = new HashMap<>();
        for(char c:magazine.toCharArray()){
                mag.put(c,mag.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray()){
                ran.put(c,ran.getOrDefault(c,0)+1);
        }
        for(char c: ran.keySet()){
            int count = ran.get(c);
            int countAvailable = mag.getOrDefault(c,0);
            if(count>countAvailable){
                return false;
            }
        }
        return true;
    }
}