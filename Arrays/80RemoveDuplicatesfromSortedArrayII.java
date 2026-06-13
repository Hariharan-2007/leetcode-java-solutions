class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left =0;
        int val = nums[0];
        int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]==val){
                count++;
                if(count>2){
                    continue;
                }
                nums[left++]=nums[i];
                
            }else{
                val = nums[i];
                nums[left++]=val;
                count=1;
            }
        }
        return left;
    }
}