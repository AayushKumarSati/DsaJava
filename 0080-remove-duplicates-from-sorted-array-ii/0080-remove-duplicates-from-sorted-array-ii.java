class Solution {
    public int removeDuplicates(int[] nums) {
        //check is array size 2 and less than return directly 
        if(nums.length<=2){
            return nums.length;
        }
        // start k and i with 2
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}