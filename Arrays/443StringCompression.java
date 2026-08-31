class Solution {
    public int compress(char[] chars) {
        int index =0;
        int i=0;
        while(i<chars.length){

            char c = chars[i];
            int count =0;
            while(i<chars.length && c == chars[i]){
                count++;
                i++;
            }
            chars[index++]=c;
            if(count>1){
                for(char j:String.valueOf(count).toCharArray()){
                    chars[index++]=j;
                }
            }
        }
        return index;
    }
}