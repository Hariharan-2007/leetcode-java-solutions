class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>mps = new HashMap<>();
        for(char c: s.toCharArray()){
            mps.put(c,mps.getOrDefault(c,0)+1);

        }
        
        int val1 =0;
        for(int i =0;i<s.length();i++){
            if(mps.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}