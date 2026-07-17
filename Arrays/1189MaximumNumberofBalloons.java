class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>mps = new HashMap<>();
        for(char c:text.toCharArray()){
            mps.put(c,mps.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        StringBuilder str = new StringBuilder();
        
        int b = mps.getOrDefault('b',0);
        int a = mps.getOrDefault('a',0);
        int l = mps.getOrDefault('l',0)/2;
        int o = mps.getOrDefault('o',0)/2;
        int n = mps.getOrDefault('n',0);
        
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}