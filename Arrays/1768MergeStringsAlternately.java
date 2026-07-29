class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st= new StringBuilder();
        int n = word1.length()+ word2.length();

        int left =0;
        int right =0;
        for(int i=0;i<n;i++){
            if(left<word1.length()){
                st.append(word1.charAt(left++));
            }
            if(right<word2.length()){
                st.append(word2.charAt(right++));
            }
        }
        return st.toString();
    }
}