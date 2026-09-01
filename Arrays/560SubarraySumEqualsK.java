// // class Solution {
// //     public int subarraySum(int[] nums, int k) {
        
// //         HashMap<Integer,Integer>prefix = new HashMap<>();
// //         prefix.put(0,1);

// //         int currentsum=0;
// //         int count =0;

// //         for(int num:nums){
// //             currentsum+=num;

// //             int need = currentsum-k;
// //             if(prefix.containsKey(need)){
// //                 count+=prefix.get(need);
// //             }
// //             prefix.put(currentsum,prefix.getOrDefault(currentsum,0)+1);

// //         }
// //         return count;
// //     }
// // }


// class Solution {
//     public int subarraySum(int[] nums, int k) {
        
//         HashMap<Integer,Integer>prefix = new HashMap<>();
//         prefix.put(0,1);

//         int currentsum=0;
//         int count =0;

//         for(int num:nums){
//             currentsum+=num;

//             int need = currentsum-k;
//             if(prefix.containsKey(need)){
//                 count+=prefix.get(need);
//             }
//             prefix.put(currentsum,prefix.getOrDefault(currentsum,0)+1);

//         }
//         return count;
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer>prefix = new HashMap<>();
        prefix.put(0,1);

        int currentsum=0;
        int count =0;

        for(int num:nums){
            currentsum+=num;

            int need = currentsum-k;
            if(prefix.containsKey(need)){
                count+=prefix.get(need);
            }
            prefix.put(currentsum,prefix.getOrDefault(currentsum,0)+1);

        }
        return count;
    }
}


