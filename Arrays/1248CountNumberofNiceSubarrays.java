class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // Array to store the frequency of each prefix sum (count of odd numbers)
        int[] prefixCounts = new int[nums.length + 1];
        prefixCounts[0] = 1; // Base case: prefix sum of 0 occurs 1 time initially
        
        int currentOddCount = 0;
        int niceSubarrays = 0;
        
        for (int num : nums) {
            // Increment count if the number is odd (num % 2 == 1 or num & 1)
            currentOddCount += (num & 1);
            
            // If we have seen at least 'k' odds, we check how many times the prefix 
            // sum of (currentOddCount - k) has occurred.
            if (currentOddCount >= k) {
                niceSubarrays += prefixCounts[currentOddCount - k];
            }
            
            // Increment the frequency of the current prefix sum
            prefixCounts[currentOddCount]++;
        }
        
        return niceSubarrays;
    }
}