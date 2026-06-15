class Solution {
    public boolean increasingTriplet(int[] nums) {
        long n = nums.length;
        int first=nums[0],second=Integer.MAX_VALUE,third =0;
        boolean check = false;
        boolean check2 = false;
        // for(int i =0;i<n;i++){
        //     if(nums[i]<0){
        //         return false;
        //     }
        // }
        for(int i =1;i<n;i++){
            
            if(nums[i]<=first){
                // check = false;
                first = nums[i];
            }else{
                if(nums[i]>first&& (!(second<nums[i])||second==Integer.MAX_VALUE)){
                    second = nums[i];
                }
                if(second<nums[i]){
                        check = true;
                        break;
                }
                
                
            }
        }
        if(check ){
            return true;
        }else{
            return false;
        }
        
    }
}