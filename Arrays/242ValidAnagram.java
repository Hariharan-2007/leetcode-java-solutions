import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        // char arr1[]= s.toCharArray();
        // char arr2[]= t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if(arr1.length != arr2.length){
        //     return false;
        // }
        // for(int i=0;i<n;i++){
        //     if(arr1[i]==arr2[i]){
        //         continue;
        //     }else{
        //         return false;
        //     }
        // }
        // return true;

        HashMap<Character,Integer>mps = new HashMap<>();
        for(char c: s.toCharArray()){
            mps.put(c,mps.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
           
                mps.put(c,mps.getOrDefault(c,-1)-1);
            
        }
        for(int val : mps.values()){
            if(val>0 || val<0){
                return false;
            }
        }
        return true;
    }
}