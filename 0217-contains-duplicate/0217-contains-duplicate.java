class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
         * optimal Approach by using the ArrayList but it's searching time complexiy is
         * O(n) it means we use HashSet it's very good choice
         */
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
}