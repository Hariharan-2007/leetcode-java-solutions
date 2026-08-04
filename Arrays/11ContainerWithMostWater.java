class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int n = height.length;
        int right =n-1;
        int finalval = 0;
        while(left<right){
            int minval = Math.min(height[left],height[right]);
            int width = right-left;
            int area = minval*width;
            finalval = Math.max(area,finalval);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return finalval;
    }
}