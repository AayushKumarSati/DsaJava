class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int maxindex = 0;
        // step1: Find the max and secondmax elements
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxindex = i;

            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        // check the secondmax*2<=max than return index of max element else return -1;
        if (smax * 2 <= max) {
            return maxindex;
        }
        else{
            return -1;
        }

    }
}