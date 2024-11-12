class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        /*1st approach
        // for(int i=0; i<n-1; i++){
        //     if(arr[i]==arr[i+1]){
        //         return arr[i];
        //     }
        // }
        */


        /*2nd approach using two pinter*/
        int start=0,end=1;
        while(start<n-1 && end<n){
            if(arr[start]==arr[end]){
                return arr[start];
            }
            start++;
            end++;
        }
        return -1;
       
 
       
    


    }
}