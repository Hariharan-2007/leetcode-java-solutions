class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        // for(String s: patterns){
        //     if(word.contains(s)){
        //         count++;
        //     }
        // }
        for(int i =0;i<patterns.length;i++){
            String str = patterns[i];
            int left =0;
            boolean check = true;
            
            for(int j =0;j<=word.length()-str.length();j++){
               int k=0;
                while(k<str.length() && str.charAt(k)==word.charAt(j+k)){
                    k++;
                }
                if(k==str.length()){
                    check = false;
                    break;
                }
            }
                if(!check){
                    count++;
                }
        }
        return count;
    }
}