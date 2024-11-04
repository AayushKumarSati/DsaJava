class Solution {
    public void sortColors(int[] nums) {
        // this question approach is dutch national flag algorithms base
        //use the three pointer for this algo
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums,low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else {//if nums[mid]==2
                 swap(nums,high, mid);
                high--;

            }
        }
    }

    // write the swapping methods because swap again and again
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}