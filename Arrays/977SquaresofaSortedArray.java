// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int arr[]= new int[nums.length];
//         // for(int i =0;i<nums.length;i++){
           
//         //     arr[i]= nums[i]*nums[i];
//         // }
//         // Arrays.sort(arr);
//         // return arr;
        
//         int n = nums.length;
//         int left =0;
//         int right =n-1;
//         int pos = n-1;
//         while(left<=right){
//             int leftsq = nums[left]*nums[left];
//             int rightsq = nums[right]*nums[right];
//             if(leftsq<rightsq){
//                 arr[pos]=rightsq;
//                 right--;
//             }else {
//                 arr[pos]=leftsq;
//                 left++;
//             }
//             pos--;
//         }

//         return arr;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]= new int[nums.length];
        // for(int i =0;i<nums.length;i++){
           
        //     arr[i]= nums[i]*nums[i];
        // }
        // Arrays.sort(arr);
        // return arr;
        int n = nums.length;
        int left =0;
        int right =n-1;
        int pos = n-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];
            if(leftsq<rightsq){
                arr[pos]=rightsq;
                right--;
            }else {
                arr[pos]=leftsq;
                left++;
            }
            pos--;
        }

        return arr;
    }
}