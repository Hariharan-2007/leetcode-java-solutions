class Solution {

    public boolean isSequence(String word,List<List<Integer>>ls){
            int currentindex =-1;
        for(char c:word.toCharArray()){
            List<Integer>list = ls.get(c-'a');
            int target = currentindex+1;
            int insertpoint=Collections.binarySearch(list,target);
            if(insertpoint<0){
                insertpoint= -1-(insertpoint);
            }
            if(insertpoint==list.size()){
                return false;
            }
            currentindex=list.get(insertpoint);
        }
        return true;
    }
    public int numMatchingSubseq(String s, String[] words) {
        List<List<Integer>>ls = new ArrayList<>();
        for(int i=0;i<26;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<s.length();i++){
            ls.get(s.charAt(i)-'a').add(i);
        }
        int count =0;
        for(String word:words){
            if(isSequence(word,ls)){
                count++;
            }
        }
        return count;
    }
}