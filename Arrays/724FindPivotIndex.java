class Solution {
    public int pivotIndex(int[] nums) {
        int arr1[]= new int[nums.length];
        int arr2[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr1[i]=nums[i];
            }else{

            arr1[i]= nums[i]+arr1[i-1];
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                arr2[i]=nums[i];
            }else{
            arr2[i]= nums[i]+arr2[i+1];

            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr1[i]==arr2[i]){
                return i;
            }
        }
        return -1;
    }
}