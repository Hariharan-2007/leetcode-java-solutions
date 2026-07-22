class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mps = new HashMap<>();
        for(String s:strs){
            char arr[]= s.toCharArray();
            Arrays.sort(arr);
            String st= new String(arr);
            if(!mps.containsKey(st)){
                mps.put(st,mps.getOrDefault(st,new ArrayList<>()));
            }
            mps.get(st).add(s);
        }
        return new ArrayList<>(mps.values());
        
    }
}