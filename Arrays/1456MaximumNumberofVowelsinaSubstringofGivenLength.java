class Solution {

    public boolean isVowel(char ch){
        
        char c = Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        
        return false;
    }
    public int maxVowels(String s, int k) {
        int max =0;
        int current =0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                current++;
            }
        }
        max=current;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                current--;
            }
            if(isVowel(s.charAt(i))){
                current++;
            }

            max = Math.max(current,max);
        }
        return max;

    }
}