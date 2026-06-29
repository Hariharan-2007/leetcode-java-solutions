class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i=1;i<n;i++){
            int count =1;
            StringBuilder str = new StringBuilder();
            for(int j=1;j<result.length();j++){
                if(result.charAt(j-1)==result.charAt(j)){
                    count++;
                }else{
                    str.append(count);
                    str.append(result.charAt(j-1));
                    count=1;
                }
            }
            str.append(count);
            str.append(result.charAt(result.length()-1));
            result = str.toString();

        }
        return result;
    }
}