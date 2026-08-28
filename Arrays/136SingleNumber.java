// class Solution {
//     public int singleNumber(int[] nums) {
//         if(nums.length==1){
//             return nums[0];
//         }
        
//         int xorvalue=nums[0];
//         // for(int n : nums){
//         //     if(n<0){
//         //         return -1;
//         //     }
//         // }
//         for(int i=1;i<nums.length;i++){
            
//             xorvalue= xorvalue^nums[i];
//         }
//         return xorvalue;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums[0];
        for(int i=1;i<nums.length;i++){
            n^=nums[i];
        }
        return n;
    }
}