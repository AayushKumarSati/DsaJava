class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;
        int start = 0, end = n - 1, mid;
        while (start <= end) {
            // find the mid
            mid = start + (end - start) / 2;
            // compare
            // arr[mid]==key
            if (arr[mid] == key) {
                return mid;

            }
            // arr[mid]<key
            else if (arr[mid] < key) {
                start = mid + 1;

            }
            // arr[mid]>key
            else {
                end = mid - 1;
            }

        }
        return -1;

    }
}