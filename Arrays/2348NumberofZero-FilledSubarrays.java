class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // long total = 0;
        // long count =0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count++;
        //     }else{
        //         if(count==0){
        //             continue;
        //         }else{
        //             total+= (count*(count+1)/2);
        //             count=0;
        //         }
        //     }
        // }
        // if(count!=0){
        //     // total+=count;
        //             total+= (count*(count+1)/2);
        // }
        // return total;

        long count =0;
        long total =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                total+=count;
            }else{
                count=0;
            }
        }
        return total;

    }
}