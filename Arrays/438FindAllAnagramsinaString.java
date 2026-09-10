class Solution {

    public boolean anagram(String s,String p){
        
         int[] cha= new int[26];
        for(int i=0;i<s.length();i++){
            cha[s.charAt(i) - 'a']++;
            cha[p.charAt(i) - 'a']--;
        }

        for(int val:cha){
            
            if(val!=0){
                return false;
            } 
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        
        String str1="";
        String str2="";

        List<Integer>ls = new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            str1 = s.substring(i,p.length()+i);
            if(anagram(str1,p)){
                ls.add(i);

            }
        }
        return ls;
    }
}