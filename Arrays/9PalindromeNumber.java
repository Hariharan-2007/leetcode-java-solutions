class Solution {
    public boolean isPalindrome(int x) {
        int left =0;
        int right = String.valueOf(x).length()-1;
        String str = String.valueOf(x);
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}