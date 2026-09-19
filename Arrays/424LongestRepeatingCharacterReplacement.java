class Solution {
    public int characterReplacement(String s, int k) {
        int counts[]= new int[26];
        int left =0;
        int maxfre=0;
        int maxlen=0;

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'A']++;
            maxfre= Math.max(maxfre,counts[s.charAt(i)-'A']);

            while((i-left+1)-maxfre>k){
                counts[s.charAt(left)-'A']--;
                left++;
            }
            maxlen= Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}