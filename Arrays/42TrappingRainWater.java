class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int left =0;
        int n = height.length;
        int right = n-1;
        int leftmax =height[left];
        int rightmax = height[right];
        int trap =0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax = Math.max(leftmax,height[left]);
                trap+= Math.max(0,leftmax-height[left]);
            }else{
                right--;
                rightmax= Math.max(rightmax,height[right]);
                trap+=Math.max(0,rightmax-height[right]);
            }
            

        }
        return trap;
    }
}