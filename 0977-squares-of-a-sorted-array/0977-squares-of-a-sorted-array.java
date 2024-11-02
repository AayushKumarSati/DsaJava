class Solution {
    public int[] sortedSquares(int[] nums) {
       // Broot Force Approach
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i]*= nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;








        /*Optimal Approach*/
        int n=nums.length;
        int start=0;
        int end=n-1;
        int []ans=new int[n];
        int i=n-1;
        while(start<=end){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                ans[i]=nums[start]*nums[start];
                start++;
            }
            else{
                ans[i]=nums[end]*nums[end];
                end--;

            }
            i--;
        }
        return ans;
    }
}