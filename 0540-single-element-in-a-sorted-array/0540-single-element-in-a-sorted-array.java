class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // handle the edeges cases:
        if (n == 1) {// if the arrays size is one
            return nums[0];

        } else if (nums[0] != nums[1]) {
            // for starting elements
            return nums[0];

        } else if (nums[n - 1] != nums[n - 2]) {
            // last elements
            return nums[n - 1];
        }

        // use the binary search approach
        int start = 0, end = n - 1;
        while (start <= end) {
            // find the mid elements of the given array
            int mid = start + (end - start) / 2;
            // check the single elements present on the mid index or not
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // if the mid elements is present on the odd index than ..
            else if (mid % 2 == 1) {
                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
            // if the mid elements is present on the even index than ..

            else {
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}