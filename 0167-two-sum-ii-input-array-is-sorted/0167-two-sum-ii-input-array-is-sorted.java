class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                break;
            }
        }
        //because we are return to the +1 increasing in index
        return new int[] { start + 1, end + 1 };

    }
}
