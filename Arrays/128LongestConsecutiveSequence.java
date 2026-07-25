class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxval = 0;
        int count =0;
        if(set.isEmpty()){
            return 0;
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int currentval =n;
                count =1;
                while(set.contains(currentval+1)){
                    currentval+=1;
                    count++;
                }
                maxval = Math.max(maxval,count);
            }
        }
        return maxval;
    }
}