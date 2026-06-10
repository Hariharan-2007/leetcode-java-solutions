class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer>maps = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            maps.put(val,maps.getOrDefault(val,0)+1);
        }
        int maxKey = 0;
        int maxValue = 0;
        for(Map.Entry<Integer,Integer>mp : maps.entrySet()){
            if(mp.getValue()>maxValue){
                maxValue = mp.getValue();
                maxKey = mp.getKey();
            }
        }
        return maxKey;
    }
}