class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // step1: find the gola index arr[i-1]<arr[i]
        int golaindex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                golaindex = i - 1;
                break;

            }
        }
        // step2:just greater elements of after golaindex
        if (golaindex != -1) {
            int swapindex = golaindex;
            for (int i = n - 1; i >= golaindex + 1; i--) {
                if (nums[i] > nums[golaindex]) {
                    swapindex = i;
                    break;
                }
            }
            // swap the nums[golaindex] and nums[swapindex]
            int temp = nums[golaindex];
            nums[golaindex] = nums[swapindex];
            nums[swapindex] = temp;
        }
        // Step 3: Reverse the elements after golaindex
        reverse(nums, golaindex + 1, n - 1);

    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}