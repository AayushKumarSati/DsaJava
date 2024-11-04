
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // this is the first approach using in-built sorting methods and the time
        // complexity(O(n log n));
        /*
         * List<Integer>list=new ArrayList<>();
         * Arrays.sort(nums);
         * for(int i=0; i<nums.length; i++){
         * if(nums[i]==target){
         * list.add(i);
         * }
         * }
         * return list;
         */

        // by using the optimal approach and the time complexity(O(N))
        int numcount = 0;
        int targetcount = 0;
        for (int ele : nums) {
            if (ele == target) {
                targetcount++;

            } else if(ele<target) {
                numcount++;
            }
        }

        //find the index of target elements 
        List<Integer> ans = new ArrayList<>();
        while (targetcount > 0) {
            ans.add(numcount);
            numcount++;
            targetcount--;
        }
        return ans;

    }
}