class Solution {
    //find the first occurences 
    private static int findfirstpositon(int[]arr,int target){
        int start = 0, end = arr.length - 1, first = -1;
        // to check the first occurence
        while (start <= end) {
            // find mid
           int  mid = start + (end - start) / 2;
            // condition
            // arr[mid]==target
            if (arr[mid] == target) {
                first = mid;
                // to check first occurence
                end = mid - 1;

            }
            // arr[mid]<target
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // arr[mid]>target
            else {
                end = mid - 1;
            }

        }
        return first;
        
    }
    //find the last occurences
     private static int findlastindexposition(int[]arr,int target){
         int start =0 ,end = arr.length - 1,last=-1;
        while (start <= end) {
            // find mid
           int  mid = start + (end - start) / 2;
            // condition
            // arr[mid]==target
            if (arr[mid] == target) {
                last = mid;
                // to check last occurence
                start = mid + 1;

            }
            // arr[mid]<target
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // arr[mid]>target
            else {
                end = mid - 1;
            }

        }
        return last;

     }

    public int[] searchRange(int[] arr, int target) {

        // to check the second occurence
        int[]ans=new int[2];
        ans[0]=findfirstpositon(arr,target);
        ans[1]=findlastindexposition(arr,target);
        return ans;
       
    }
     

}