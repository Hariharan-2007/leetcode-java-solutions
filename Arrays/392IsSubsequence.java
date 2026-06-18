class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        // char arr[]=t.toCharArray();
        // char arr2[]=s.toCharArray();
        int left =0;
        // for(int i=0;i<n;i++){
        //     if(left>=s.length()){
        //         break;
        //     }
        //     if(arr2[left]==arr[i]){
        //         left++;
        //     }else{
        //         continue;
        //     }
        // }
        // if(left>=s.length()){
        //     return true;
        // }else{
        //     return false;
        // }
        for(int i=0;i<n;i++){
            if(left>=s.length()){
                break;
            }
            if(s.charAt(left)==t.charAt(i)){
                left++;
            }
        }
        if(left>=s.length()){
            return true;
        }else{
            return false;
        }


    }
}