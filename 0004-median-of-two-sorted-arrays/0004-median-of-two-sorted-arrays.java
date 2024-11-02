class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        /* Create A New Arrays */
        int[] mergedboth = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            mergedboth[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            mergedboth[k++] = nums2[i];
        }
        /* Now The Sorted Of Two New Arrys. */
        Arrays.sort(mergedboth);
        int tot = mergedboth.length;
        /* Now Find The Median Of Two Form First is odd And Second Is Even */
        if (tot % 2 == 1) {// this is the odd Approach;
            return (double) mergedboth[tot / 2];
        } else {
            // this is the even approach;

            int mid1 = mergedboth[tot / 2 - 1];
            int mid2 = mergedboth[tot / 2];
            return ((double) mid1 + (double) mid2) / 2.0;

        }
    }
}