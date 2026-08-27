// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder st= new StringBuilder();
//         int n = word1.length()+ word2.length();

//         int left =0;
//         int right =0;
//         for(int i=0;i<n;i++){
//             if(left<word1.length()){
//                 st.append(word1.charAt(left++));
//             }
//             if(right<word2.length()){
//                 st.append(word2.charAt(right++));
//             }
//         }
//         return st.toString();
//     }
// }
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int left=0,right=0;
        for(int i=0;i<len1+len2;i++){
            if(i<len1){
                str.append(word1.charAt(i));
                
            }
            if(i<len2){
                str.append(word2.charAt(i));

            }
        }
        return str.toString();
    }
}