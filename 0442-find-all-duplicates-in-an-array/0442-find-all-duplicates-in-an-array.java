class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         list.add(nums[i]);
        //     }
        // }
        // return list;
        // int start=0,end=1;
        // while(start<nums.length-1 &&end<nums.length ){
        //     if(nums[start]==nums[end]){
        //         list.add(nums[start]);
        //     }
        //     start++;
        //     end++;
        // }
        // return list;


        /*3rd and best optimal Approach=>O(n) complexity ans space complexity:O(1);*/
        for(int i=0; i<nums.length; i++){
            //find the current element 
            int element =Math.abs(nums[i]);
            //find element sit on which seat
            int seat=element-1;
            //negative seat
            if(nums[seat]<0){
                list.add(element);
                }
            else{
                nums[seat]=-nums[seat];
                }
            
        }return list;
    }

}