class Solution {
    public int findPairs(int[] nums, int k) {

        // First approach time complexity :O(nlogn+n^2=O(N LogN))
        /**
         * if (k < 0) {
         * return 0;
         * }
         * int ans = 0;
         * Arrays.sort(nums);
         * for (int i = 0; i < nums.length - 1; i++) {
         * // avoid the duplicates elements
         * if (i > 0 && nums[i] == nums[i - 1])
         * continue;
         * for (int j = i + 1; i < nums.length; j++) {
         * int diff = nums[j] - nums[i];
         * if (diff == k) {
         * ans++;
         * break;// break the unique pairs
         * }
         * if (diff > k) {
         * break;
         * }
         * 
         * }
         * 
         * }
         * return ans;
         */

        // 2nd approach using the hashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        // add all the elements in the hashmap
        for (int ele : nums) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);

        }
        int ans = 0;
        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    ans++;
                }

            } else {

                if (hm.containsKey(entry.getKey() + k)) {
                    ans++;
                }
            }
        }
        return ans;

    }
}