// class Solution {
//     public boolean isPalindrome(String s) {
//         if(s.isEmpty()){
//             return false;
//         }
//         StringBuilder str = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(Character.isLetterOrDigit(s.charAt(i))){
//                 str.append(Character.toLowerCase(s.charAt(i)));
//             }
//         }
//         String str1 = new String(str.toString());
//         if(str1.equals(str.reverse().toString())){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        String st=str.toString();
        int left =0;
        int right = st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}