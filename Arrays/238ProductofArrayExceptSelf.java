class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[]= new int[n];
        int left =0;
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=1;
            }else{
                arr[i]=arr[left++]*nums[i-1];
            }

        }
        int left2 =n-1;
        int temp=0,value=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                temp = nums[i];
                nums[i]=1*arr[left2--];
            }else{
                value=nums[i];
                nums[i]=arr[left2--]*temp;
                temp*=value;
                
            }

        }
        
        return nums;
    }
}