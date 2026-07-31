class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mps = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(mps.containsKey(target-nums[i])){
                return new int[] {mps.get(complement),i};
            }
            mps.put(nums[i],i);
        }
        return new int[] {};
    }
}