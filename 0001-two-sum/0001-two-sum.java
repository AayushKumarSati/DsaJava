class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(arr);
        int[] ans = new int[2];
        //     int start=0,end=arr.length-1;
        //     while(start<end){
        //         int sum=arr[start]+arr[end];
        //         if(sum<target){
        //             start++;

        //         }
        //         else if(sum>target){
        //             end--;

        //         }
        //         else{
        //             ans[0]=start;
        //             ans[1]=end;

        //         }
        //     }

        //by using to the hashmap

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (hm.containsKey(comp)) {
                ans[0]=hm.get(comp);
                ans[1]=i;

            }
            hm.put(nums[i], i);
        }
        return ans;

    }
}