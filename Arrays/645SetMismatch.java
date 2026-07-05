class Solution {
    public int[] findErrorNums(int[] nums){
        int n = nums.length;
        int arr[]= new int[n+1];
        for(int val:nums){
            arr[val]++;
        }
        int miss=0,dup=0;
        for(int i =1;i<=n;i++){
            if(arr[i]==0){
                miss=i;
            }
            if(arr[i]==2){
                dup = i;
            }
        }
        return new int[]{dup,miss};
    }
}