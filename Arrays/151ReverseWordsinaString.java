class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i =arr.length-1;i>=0;i--){
            if(i==0){
                str.append(arr[i]);
            }else{
                
                str.append(arr[i]).append(" ");
            }
        }
        return str.toString();
    }
}