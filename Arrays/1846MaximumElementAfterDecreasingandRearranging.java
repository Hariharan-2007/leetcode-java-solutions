class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int val = arr[0];
        for(int i=0;i<arr.length;i++){
            if(i>0){
                if(Math.abs(arr[i]-arr[i-1])<=1){
                    continue;
                }else{
                    arr[i]=arr[i-1]+1;
                }
            }else{
                arr[0]=1;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int n: arr){
            if(max<n){
                max = n;
            }
        }
        return max;
    }
}