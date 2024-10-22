class Solution {
    /*this code using the merge sort*/
    /*
     * Step1 : divide the arrays in a single nodes
     */
    public static void Divide(int[] arr, int start, int end) {
        /*
         * base case:start and end is the same locations
         */
        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;

        /* left part in the arrays */
        Divide(arr, start, mid);
        /* right part in the arrays */
        Divide(arr, mid + 1, end);
        /* merge */
        merge(arr, start, mid, end);

    }

     /*
     * Step2 : merge the arrays in the sorted form
     */
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start, right = mid + 1, index = 0;
        while (left <= mid && right <= end) {
            /*
             * check left and rigth which elements in smaller than
             */
            /* left is smaller */
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                index++;
                left++;
            }
            /* right is smaller */
            else {
                temp[index] = arr[right];
                index++;
                right++;
            }
        }
        /* left array is not empty yet */
        while (left <= mid) {
            temp[index] = arr[left];
            index++;
            left++;
        }
        /* Right array is not empty yet */
        while (right <= end) {
            temp[index] = arr[right];
            index++;
            right++;
        }
        /* to put the temp arrays values in the original arrays */
        index = 0;
        while (start <= end) {
            arr[start] = temp[index];
            start++;
            index++;
        }
    }
    public int[] sortArray(int[] nums) {
        Divide(nums,0,nums.length-1);
        return nums;
    }
}