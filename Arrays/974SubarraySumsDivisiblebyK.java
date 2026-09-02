class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int remainder[]= new int[k];

        remainder[0]=1;
        int count=0;
        int prefix =0;


        for(int n:nums){
            prefix+=n;

            int currentremainder = prefix%k;
            if(currentremainder<0){
                currentremainder+=k;
            }
             count+=remainder[currentremainder];
            remainder[currentremainder]++;
        }
        return count++;
    }
}