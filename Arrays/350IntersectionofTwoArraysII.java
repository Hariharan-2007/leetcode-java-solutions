class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mps = new HashMap<>();
        int n = nums1.length;
        int m = nums2.length;
        int len = Math.min(n,m);
        List<Integer>ls = new ArrayList<>();
        if(len==m){
            for(int i:nums1){
                mps.put(i,mps.getOrDefault(i,0)+1);
            }
            for(int i=0;i<m;i++){
                if(mps.containsKey(nums2[i])){
                    int val = mps.get(nums2[i]);
                    if(val>0){

                    mps.put(nums2[i],mps.get(nums2[i])-1);
                    ls.add(nums2[i]);
                    }
                }
            }

        }else{

            for(int i:nums2){
                mps.put(i,mps.getOrDefault(i,0)+1);
            }
            for(int i=0;i<n;i++){
                if(mps.containsKey(nums1[i])){
                    int val = mps.get(nums1[i]);
                    if(val>0){

                    mps.put(nums1[i],mps.get(nums1[i])-1);
                    ls.add(nums1[i]);
                    }
                }
            }
        }
        int lslen = ls.size();
        int arr[]= new int[lslen];
        for(int i=0;i<lslen;i++){
            arr[i]=ls.get(i);
        }
        return arr;

    }
}
