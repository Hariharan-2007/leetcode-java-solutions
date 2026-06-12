class Solution {
    public void rotate(int[] nums, int k) {
        int[] newarr = new int[nums.length];
        int n = nums.length;
        int left =-1;
        k = k%n;
        if(k==0){
            return ;
        }
        for(int i = n-k;i<n;i++ ){
            newarr[++left]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            newarr[++left]=nums[i];
            
        }
        for(int i=0;i<n;i++){
            nums[i]=newarr[i];
        }
    }
}