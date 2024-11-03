class Solution {
    public boolean increasingTriplet(int[] nums) {
        // creating the three variable pointer
        int first = Integer.MAX_VALUE;// (+infinity)
        int second = Integer.MAX_VALUE;// (+infinity)
        int third = Integer.MAX_VALUE;// (+infinity)
        for (int i = 0; i < nums.length; i++) {
            // in value
            int ele = nums[i];
            if (first >= ele) {
                first = ele;

            } else if (second >= ele) {
                 second=ele;
            } else {
                third = ele;
                return true;

            }

        }
        return false;
    }
}