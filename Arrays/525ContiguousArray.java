class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>mps = new HashMap<>();
        mps.put(0,-1);
        int max =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=nums[i];
            }else{
                count-=1;

            }
            if(mps.containsKey(count)){
                max = Math.max(max,i-mps.get(count));
            }else{
                mps.put(count,i);
            }
        }
        return max;
    }
}