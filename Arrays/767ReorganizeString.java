class Solution {
    public String reorganizeString(String s) {
        int arr[]= new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int maxval=0;
        int maxindex=0;
        for(int i=0;i<26;i++ ){
            if(maxval<arr[i]){
                maxindex=i;
                maxval = arr[i];
            }
        }
        if(((s.length()+1)/2)<maxval){
            return "";
        }
        char result[] = new char[s.length()];
        int index =0;
        while(arr[maxindex]>0){
            result[index]=(char) (maxindex+'a');
            index+=2;

            arr[maxindex]--;
        }
        for(int i=0;i<26;i++){
            while(arr[i]>0){
            if(index>=s.length()){
                index =1;
            }

            result[index]=(char)(i+'a');
            index+=2;
            arr[i]--;
            }
        }
        return new String(result);
        
    }
}