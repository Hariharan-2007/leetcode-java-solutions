class Solution {
    public int hammingDistance(int x, int y) {
        int count =0;
        // for(int i =0;i<32 ;i++){
        //     int val1 = (x>>i)&1;
        //     int val2 =(y>>i)&1;
        //     if((val1^val2)==1){
        //         count++;
        //     }
        // }
        // return count;

        int val = x^y;
        while(val>0){
            if((val&1)==1){
                count++;
            }
            val>>=1;
        }
        return count;
    }
}