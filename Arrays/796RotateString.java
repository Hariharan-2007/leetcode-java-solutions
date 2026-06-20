class Solution {
    public boolean rotateString(String s, String goal) {
        int left=0;
        if(s.length()!=goal.length()){
            return false;
        }
        int n = s.length();
        // while(left<n){
        //     if(s.charAt(left)==goal.charAt(left)){
        //         left++;
        //     }
        //     else{
                // StringBuilder str = new StringBuilder(s);
                // char c = str.charAt(0);
                // str.deleteCharAt(0);
                // str.append(c);
                // s=str.toString();
                // n--;
                // left=0;
        //     }
        // }
        // if(s.equals(goal)){
        //     return true;
        // }else{
        //     return false;
        // }

        // while(n>0){
        //     if(s.equals(goal)){
        //         return true;
        //     }else{
        //          StringBuilder str = new StringBuilder(s);
        //             char c = str.charAt(0);
        //         str.deleteCharAt(0);
        //         str.append(c);
        //         s=str.toString();
        //         n--;
                
        //     }
        // }
        // if(s.equals(goal)){
            
        //         return true;
        //     }
        // else{
        //     return false;
        // }

        return (s+s).contains(goal);

    }
}