
class Solution {
    public int findLucky(int[] arr) {
        /*
         * Arrays frequency question is always use the hashMap
         */
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            // check the elements already present than increase the frequency

            if (hm.containsKey(ele) == true) {
                hm.put(ele, hm.get(ele) + 1);

            } else {
                // elements are already not present than
                hm.put(ele, 1);

            }
        }
        int ans = -1;
        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);

            }
        }
        return ans;

    }
}