class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(char c:s.toCharArray()){
            if(c!='#'){
                str1.append(c);
            }else if(str1.length()>0){
                str1.deleteCharAt(str1.length()-1);
            }
        }
        for(char c:t.toCharArray()){
            if(c!='#'){
                str2.append(c);
            }else if(str2.length()>0){
                str2.deleteCharAt(str2.length()-1);
            }
        }
        if(!str1.toString().equals(str2.toString())){
            return false;
        }
        return true;
    }
}