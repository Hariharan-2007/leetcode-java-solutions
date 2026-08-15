// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         int left =0;
//         int right = n-1;;
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[left]+numbers[right]>target){
//                 right--;
//                 continue;
//             }else if(numbers[left]+numbers[right]<target){
//                 left++;
//                 continue;

//             }else if(numbers[left]+numbers[right]==target){
//                 return new int[]{left+1,right+1};
                
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left =0;
       int n = numbers.length;
       int right= n-1;
       while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[] {left+1,right+1};
                
            }else if(numbers[left]+numbers[right] < target){
                left++;
            }else{
                right--;
            }
       }
       return new int[] {};
    }
}