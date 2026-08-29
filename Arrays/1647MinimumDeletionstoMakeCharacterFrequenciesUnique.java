class Solution {
    public int minDeletions(String s) {
        
        int count[]= new int[26];

        for(char c:s.toCharArray()){
            count[c - 'a']++;
        }

        Set<Integer>usedFreq = new HashSet<>();
        int deletions=0;
        for(int freq:count){
            if(freq==0){
                continue;
            }
            while(usedFreq.contains(freq)){
                deletions++;
                freq--;
            }
            if(freq>0){
                usedFreq.add(freq);
            }
        }
        return deletions;
    }
}