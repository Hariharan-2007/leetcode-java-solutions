class Solution {

    public boolean isPermutation(String s1,String s2){
        int cha[]=new int[26];

        for(int i=0;i<s1.length();i++){
            cha[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            if(cha[s2.charAt(i)-'a']==0){
                return false;
            }
            cha[s2.charAt(i) - 'a']--;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(isPermutation(s1,s2.substring(i,s1.length()+i))){
                return true;
            }
        }
        return false;
    }
}