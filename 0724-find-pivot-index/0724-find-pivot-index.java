
class Solution {
    public int pivotIndex(int[] nums) {
        // pivot index means a index this index leftside sum and rightside sum is equal
        // it's called pivot index.
        // traverse the arays and find the total sum.
        //Time Complexity:O(n) and Space Complexity:O(1)
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        // create to pointer left sum and right sum and find the pivot index.
        int rightsum = totalsum;//initially right sum is also totalsum
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightsum -= nums[i];
            if (rightsum == leftsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}