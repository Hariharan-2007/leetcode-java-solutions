class Solution {
public:
    void moveZeroes(vector<int>& nums) {
       
        int initial=0;
        
        
        for(int i=0;i<nums.size();i++){
            
            if(nums[i]!=0){
                nums[initial]=nums[i];
                initial++;
            }
            
            
            
        }
       
        for(int i=initial;i<nums.size();i++){
                nums[i]=0;
        }
        for(int i=0;i<nums.size();i++){
            cout<<nums[i]<<",";
        }
    }
};