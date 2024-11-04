class Solution {
    public int search(int[] arr, int target) {

        int ans = -1, start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;

            }
            // left side sorted arrays
            else if (arr[mid] >= arr[0]) {
                if (arr[start] <= target && arr[mid] > target) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            // right side sorted arrays
            else {
                if (arr[mid] < target && arr[end] >= target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }

        }
        return ans;
    }
}