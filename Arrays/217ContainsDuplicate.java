class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>mps = new HashMap<>();
        for(int i:nums){
            mps.put(i,mps.getOrDefault(i,0)+1);
        }
        boolean check = true;
        for(int i:mps.keySet()){
            int val=mps.get(i);
            if(val>=2){
                check = false;
                break;
            }
        }
        if(check){
        return false;
        }
            return true;
    }
}