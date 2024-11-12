class Solution {
    public int findDuplicate(int[] arr) {

        /*
         * 1st approach=>O(n^2)
         * // Arrays.sort(arr);
         * // int n = arr.length;
         * // for(int i=0; i<n-1; i++){
         * // if(arr[i]==arr[i+1]){
         * // return arr[i];
         * // }
         * // }
         */

        /* 2nd approach using two pinter */
        // int start=0,end=1;
        // while(start<n-1 && end<n){
        // if(arr[start]==arr[end]){
        // return arr[start];
        // }
        // start++;
        // end++;
        // }
        // return -1;

        /* approach number 3 */
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            ele = Math.abs(ele);// negative to positive
            if (arr[ele] > 0) {
                // if elements is positive than negative the value
                arr[ele] = -arr[ele];
            } else {
                ans = ele;
                break;
            }
        }
        /* modify the negative arrays */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        return ans;

    }
}