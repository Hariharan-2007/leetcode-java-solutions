// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer,Integer>mps = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(mps.containsKey(nums[i])){
//                 if(Math.abs(mps.get(nums[i])-i)<=k){
//                     return true;
//                 }
//             }
//             mps.put(nums[i],i);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                    if(Math.abs(map.get(nums[i])-i)<=k ){
                            return true;
                        }
                    }   
            map.put(nums[i],i);
        }
        return false;
    }
}