class Solution {
    public int[] singleNumber(int[] nums) {
        int xr=0;
        for(int n:nums){
            xr^=n;
        }
        int newxr = xr & (-xr);
        int first=0;
        int second=0;
        for(int n:nums){
            if((n&newxr)==0){
                first^=n;
            }else{
                second^=n;

            }
        }
        return new int[]{first,second};
    }
}