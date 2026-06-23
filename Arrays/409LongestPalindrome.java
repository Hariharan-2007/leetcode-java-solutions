class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>mps = new HashMap<>();
        for(char c : s.toCharArray()){
            mps.put(c,mps.getOrDefault(c,0)+1);
        }
        boolean check = false;
        int even = 0;
        int odd =0;
        for(int val : mps.values()){
            if(val%2==0){
                even+=val;
            }else{
                check = true;
                odd+= val-1;
            }
        }
        
        if(odd==0 && !check){
            return even+odd;
        }
        return even+odd+1;
    }
}