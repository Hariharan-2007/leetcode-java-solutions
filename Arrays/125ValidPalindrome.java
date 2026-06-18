class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String str1 = new String(str.toString());
        if(str1.equals(str.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}