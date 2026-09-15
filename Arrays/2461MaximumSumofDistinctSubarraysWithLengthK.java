class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum =0;
        long max =0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            if(i>=k){
                int num = nums[i-k];
                sum-=num;
                map.put(num,map.get(num)-1);

                if(map.get(num)==0){
                    map.remove(num);
                }
            }

            if(i>=k-1 && map.size()==k){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}