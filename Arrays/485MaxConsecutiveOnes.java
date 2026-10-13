// class Solution {
// public:
//     int findMaxConsecutiveOnes(vector<int>& nums) {
//         unordered_map<int,int>maps(nums.size());
        
        
//         int count=0;
//         int left=0,right=nums.size()-1;
//         int min =0;
//         for(int i=0;i<nums.size();i++){
//             if(nums[i]==0&& (i!=nums.size()-1)){
//                 count =0;
//             }if(nums[i]==1){
//                 count++;
//             }
//             if(count>min){
//                 min= count;
//             }
//         }
//         return min;
//     }
// };
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left =0;
        int count =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count =0;
            }else{
                count++;
                max = Math.max(count,max);
            }
        }
        return Math.max(max,count);
    }
}