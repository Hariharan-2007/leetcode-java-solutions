// class Solution {
//     public boolean isPalindrom(int left,int right,StringBuilder str){

//         while(left<right){
//             if(str.charAt(left)==str.charAt(right)){
//                 left++;
//                 right--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
        
    
//     public boolean validPalindrome(String s) {
//         int left = 0;
//         int right = s.length()-1;
//         StringBuilder str = new StringBuilder(s);
        
//         while(left<right){
//             if(str.charAt(left)==str.charAt(right)){
//                 left++;
//                 right--;
//             }else{
//                 return isPalindrom(left+1,right,str)||isPalindrom(left,right-1,str);

//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean valid(int left,int right,String str){
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left =0;
        int right =s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return valid(left+1,right,s)||valid(left,right-1,s);
            }
        }
        return true;
    }
}