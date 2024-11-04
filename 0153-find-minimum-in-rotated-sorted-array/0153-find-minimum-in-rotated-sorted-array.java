class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int ans = arr[0], start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            /*this is the first methods
            // left side sorted Arrays
            if (arr[mid] > arr[0]) {
                start = mid + 1;
                //right side sorted Arrays
            } else if (arr[mid] < arr[0]) {
                ans = arr[mid];
                end = mid - 1;
            }
            else{
                start=mid+1;
            }
            */
            //Second Methods
             // left side sorted Arrays
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
                //right side sorted Arrays
            }
            else{
            ans=arr[mid];
                end=mid-1;
            }
        }
        return ans;
    }
}