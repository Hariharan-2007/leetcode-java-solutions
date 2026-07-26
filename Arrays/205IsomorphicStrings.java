class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mps1= new HashMap<>();
        HashMap<Character,Character>mps2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mps1.containsKey(s.charAt(i))){
               if(mps1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
               }
            }
            if(mps2.containsKey(t.charAt(i))){
                if(mps2.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            mps1.put(s.charAt(i),t.charAt(i));
            mps2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}