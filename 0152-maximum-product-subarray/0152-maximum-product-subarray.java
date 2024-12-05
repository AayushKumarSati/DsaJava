class Solution {
    public int maxProduct(int[] nums) {
        // code here
        int n = nums.length;
        // Approach 1:time : O(n) and space is O(1)
        // int currentmax = nums[0], currentmin = nums[0], maxprod = nums[0];
        // for (int i = 0; i < n; i++) {
        // // temparory variable store the maximum product of ending
        // int temp = Math.max(nums[i], Math.max(nums[i] * currentmax, nums[i] *
        // currentmin));
        // // update the min value at the end
        // currentmin = Math.min(nums[i], Math.min(nums[i] * currentmax, nums[i] *
        // currentmin));
        // // update maximum product end at the current index
        // currentmax = temp;
        // maxprod = Math.max(maxprod, currentmax);

        // }
        // return maxprod;

        // Approach 2: time O(n) and space O(1)
        int maxprod = Integer.MIN_VALUE;
        int lefttoright = 1, righttoleft = 1;
        for (int i = 0; i < n; i++) {
            if (lefttoright == 0) {
                lefttoright = 1;
            }
            if (righttoleft == 0) {
                righttoleft = 1;
            }
            // calculate product from left to right
            lefttoright *= nums[i];
            // calculate product from right to left
            // int j=n=1-i;
            righttoleft *= nums[n - 1 - i];
            // update max product
            maxprod = Math.max(maxprod, Math.max(righttoleft, lefttoright));

        }
        return maxprod;
    }
}