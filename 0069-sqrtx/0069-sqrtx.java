class Solution {
    public int mySqrt(int x) {
          if (x < 2) {
            return x;
        }
        
        int start = 1, end = x, mid;
        int ans = 0;  // Initialize ans to a default value
        
        while (start <= end) {
            mid = start + (end - start) / 2;  // Correct calculation of mid
            
            long midSquared = (long) mid * mid;  // Use long to prevent overflow
            
            if (midSquared == x) {
                return mid;  // Exact square root found
            } else if (midSquared < x) {
                ans = mid;  // Update ans with current mid
                start = mid + 1;  // Move to the right half
            } else {
                end = mid - 1;  // Move to the left half
            }
        }
        
        return ans; 
    }
}