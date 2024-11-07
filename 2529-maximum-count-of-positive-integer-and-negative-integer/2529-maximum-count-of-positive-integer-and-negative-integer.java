class Solution {
    public int maximumCount(int[] nums) {
        // this is the first approach using the brootforce approach by using O(n) time
        // complexity
        /**
         * int countp=0;
         * int countn=0;
         * for(int i=0; i<nums.length; i++){
         * if(nums[i]>0){
         * countp++;
         * 
         * }
         * else if(nums[i]<0){
         * countn++;
         * }
         * }
         * if(countp>countn){
         * return countp;
         * 
         * }
         * else{
         * return countn;
         * }
         */

        // using binary Search and optimal approach O(LogN)
        // ans use the methods
        int lastNegIdx = lastNegative(nums) + 1;
        int firstPosIdx = nums.length - firstPositive(nums);
        // return the maximum of both
        return Math.max(lastNegIdx, firstPosIdx);

    }
    // find the last index of negative integer

    public int lastNegative(int[] nums) {
        int n = nums.length;

        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if mid is negative number
            if (nums[mid] < 0) {
                ans = mid;
                start = mid + 1;
            }
            // else mid is non-negative number
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // find the first index of positive integer
    public int firstPositive(int[] nums) {
        int n = nums.length;

        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if mid is positive number
            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            }
            // else mid is non-positive number
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}