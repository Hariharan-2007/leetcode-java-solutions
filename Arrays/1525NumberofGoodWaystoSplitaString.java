class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] rightCount = new int[26];
        int distinctRight = 0;
        
        // Step 1: Populate right side frequencies and total distinct characters
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (rightCount[c - 'a'] == 0) {
                distinctRight++;
            }
            rightCount[c - 'a']++;
        }
        
        int[] leftCount = new int[26];
        int distinctLeft = 0;
        int goodSplits = 0;
        
        // Step 2: Traverse and evaluate each split point
        for (int i = 0; i < n - 1; i++) {
            char c = s.charAt(i);
            
            // Add character to the left side
            if (leftCount[c - 'a'] == 0) {
                distinctLeft++;
            }
            leftCount[c - 'a']++;
            
            // Remove character from the right side
            rightCount[c - 'a']--;
            if (rightCount[c - 'a'] == 0) {
                distinctRight--;
            }
            
            // Check if both sides have an equal number of distinct characters
            if (distinctLeft == distinctRight) {
                goodSplits++;
            }
        }
        
        return goodSplits;
    }
}