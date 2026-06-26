class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer>mps1 = new HashMap<>();
        HashMap<Character,Integer>mps2 = new HashMap<>();
        for(int i =0;i<word1.length();i++){
            mps1.put(word1.charAt(i),mps1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i =0;i<word2.length();i++){
            mps2.put(word2.charAt(i),mps2.getOrDefault(word2.charAt(i),0)+1);
        }
        if(!mps1.keySet().equals(mps2.keySet())){
            return false;
        }
        ArrayList<Integer>list1 = new ArrayList(mps1.values());
        ArrayList<Integer>list2 = new ArrayList(mps2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
            
        
    }
}