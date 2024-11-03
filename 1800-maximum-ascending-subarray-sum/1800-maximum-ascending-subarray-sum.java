class Solution {
    public int maxAscendingSum(int[] arr) {
        int currentsum = arr[0];
        int maxsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                currentsum += arr[i];

            } else {
                // compare the max sum value
                maxsum = Math.max(currentsum, maxsum);
                currentsum = arr[i];

            }
        }
        maxsum = Math.max(currentsum, maxsum);
        return maxsum;

    }
}