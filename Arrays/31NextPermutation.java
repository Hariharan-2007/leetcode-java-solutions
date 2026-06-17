class Solution {
    public void nextPermutation(int[] nums) {
        int min = Integer.MAX_VALUE;
        int index =0;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                min = nums[i-1];
                index =i;
                break;
            }
        }
        if(index==Integer.MAX_VALUE||index==0){
            int left =index;
            int right = nums.length-1;
            while(left<right){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return ;
        }
        int value = Integer.MAX_VALUE;
        for(int j= index;j<nums.length;j++){
            if(nums[j]>min){
                value = Math.min(value,nums[j]);
                
            }
        }
        boolean check = false;
        int finalindex =0;
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]==value){
                finalindex = i;
                check = true;
                break;
            }
        }
    
        if(check){
                nums[index-1]= value;
        nums[finalindex]= min;
        int left =index;
            int right = nums.length-1;
            while(left<right){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        
           
        
    }
}