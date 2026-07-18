class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>mps = new HashMap<>();
        for(int n :nums){
            mps.put(n,mps.getOrDefault(n,0)+1);
        }
        int count =0;
        for(int i : mps.keySet()){
            if(mps.get(i)>1){
                int val = mps.get(i);
                val = val*(val-1)/2;
                count+=val;
            }
        }
        return count;
    }
}