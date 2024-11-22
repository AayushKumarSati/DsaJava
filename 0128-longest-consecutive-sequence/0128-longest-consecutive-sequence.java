class Solution {
    public int longestConsecutive(int[] nums) {
        /* this problem is solve by using the HashMap */
        HashMap<Integer, Boolean> hm = new HashMap<>();
        // step1:Traverse the array and all elements add on the HashMap;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], false);
        }
        // step2:check the starting elements to start the Consecutive Sequence because
        // we check the current key previous value present or not if present than it's
        // also false else it's true because it is starting sequence integer
        for (int ele : hm.keySet()) {
            if (hm.containsKey(ele - 1) == false) {
                hm.put(ele, true);
            }
        }
        int max = 0;
        // find key
        for (int key : hm.keySet()) {
            int k = 1;
            if (hm.get(key) == true) {
                while (hm.containsKey(key + k) == true) {
                    k++;
                }
            }
            // check max length
            max = Math.max(k, max);
        }
        return max;

    }
}