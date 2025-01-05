class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /*
         * Using Broot Force Approach
         * Time Complexity : O(N^2) & Space Complexity :O(1)
         */
        // int count = 0;
        // for (int i = 0; i < nums.size() - 1; i++) {
        // for (int j = i + 1; j < nums.size(); j++) {
        // int sum = nums.get(i) + nums.get(j);
        // if (sum < target) {
        // count++;
        // }
        // }
        // }
        // return count;

        /*
         * Using Two pointer(Optimal) Approach
         * Time Complexity : O(nlogn) & Space Complexity :O(1)
         */
        int count = 0, left = 0, right = nums.size() - 1;
        // sort the list
        nums.sort((a, b) -> a - b);
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum < target) {
                // if left and right ptr sum is less than target than considerd all the elements
                // count which is present left to right pointer mid
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;

    }
}