class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int currentsum = 0;
        for (int i = 0; i < n; i++) {
            currentsum += arr[i];

        }
        int actualsum = n*(n + 1)/ 2;
        return actualsum-currentsum;
    }
}