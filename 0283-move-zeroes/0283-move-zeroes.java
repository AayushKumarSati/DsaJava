class Solution {
    public void moveZeroes(int[] nums) {
        int nonezeroindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonezeroindex] = nums[i];
                nonezeroindex++;
            }
        }

        for (int i = nonezeroindex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}