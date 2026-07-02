class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;
        int num =0;
        for(int i =n-1;i>0;i--){
            int val = nums[i]&nums[i-1] ;
            if(val== nums[i]-1){
                count++;
                continue;
            }else{
                num = nums[i]&nums[i]-1;

                return num;
            }
        }
        if(count==n){
            return nums[n]&nums[n-1] -1;
        }
        
        return num;
    }
}