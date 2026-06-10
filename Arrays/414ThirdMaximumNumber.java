public class 414ThirdMaximumNumber {
    
}class Solution {
public:
    int thirdMax(vector<int>& nums) {
            long long n = nums.size();
        long long left =0,right = n-1;
        long long first= LLONG_MIN,second =LLONG_MIN,third =LLONG_MIN;

        for(int i=0;i<n;i++){
            if(nums[i]==first || nums[i]==second || nums[i]==third){
                continue;
            }
            if(first<nums[i]){
                third = second;
                second = first;
                first = nums[i];
            }else if(second<nums[i]){
                third = second;
                    second = nums[i];
            }else if(third<nums[i]){
                third = nums[i];
            }
            
            
            
        }
        int value = LLONG_MIN;
        return (third==LLONG_MIN)?first:third;
    }
};
