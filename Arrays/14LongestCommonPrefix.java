class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        int n = strs.length;
        String str1 = strs[0];
        String str2 = strs[n-1];
        StringBuilder st=new StringBuilder();
        int len = Math.min(str1.length(),str2.length());

        if(len==0){
            return "";
        }
        for(int i=0;i<len;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                st.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return st.toString();
    }
}