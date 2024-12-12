class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //use the two pointer approach
        int n=nums.length;
        //sort the arrays 
        Arrays.sort(nums);
        int closestSum=100000;
        for(int i=0; i<n-2; i++){
            int start=i+1,end=n-1;
            while(start<end){
                int currentSum=nums[i]+nums[start]+nums[end];
               // Update closestSum if the currentSum is closer to the target
                if(Math.abs(target-currentSum)<Math.abs(target-closestSum)){
                    closestSum=currentSum;

                }
                else if(currentSum<target){
                    start++;

                }
                else{
                    end--;

                }
            }
        }
        return closestSum;

    }
}