class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>mps1 = new HashMap<>();
        HashMap<String,Character>mps2 = new HashMap<>();
        String words[]= s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i =0;i<pattern.length();i++){
            String word =words[i];
            char ch = pattern.charAt(i);

            if(mps1.containsKey(ch)){
                if(!mps1.get(ch).equals(word)){
                    return false;
                }
            }else{
                mps1.put(ch,word);
            }
            if(mps2.containsKey(word)){
                if(mps2.get(word)!=ch){
                    return false;
                }
            }else{
                mps2.put(word,ch);
            }
        }
        return true;
        
    }
}