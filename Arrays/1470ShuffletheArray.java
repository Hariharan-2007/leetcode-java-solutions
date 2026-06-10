class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int[n*2];
        arr[0]=nums[0];
        int left =1;
        int right = n;
        for(int i=1;i<n;i++){
            
            arr[left++]=nums[right++];
            arr[left++]=nums[i];
            
        }
        arr[arr.length-1]=nums[nums.length-1];
        return arr;
    }
}