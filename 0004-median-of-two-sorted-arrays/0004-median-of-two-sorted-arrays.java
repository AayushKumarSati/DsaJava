class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        //merging arrays 
        int []ans=merge(arr1,arr2);
        int n=ans.length;
        if(n%2==0){
            //even case the ans arrays length is even number 
            double mid=(double)(ans[n/2]+ans[n/2-1])/2;
            return mid;
        }
        else{
            //odd case the ans arrays length is odd number
            double mid=(double)(ans[n/2]);
            return mid;
        }


    }

    /* merge the both sorted array; */
    public int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;
        while (ptr1 < n || ptr2 < m) {
            int val1 = ptr1 < n ? arr1[ptr1] : Integer.MAX_VALUE;//arr1 value
            int val2 = ptr2 < m ? arr2[ptr2] : Integer.MAX_VALUE;//arr2 value
            if (val1 <= val2) {
                // arr1 value is lessthan equals compare to arr2
                ans[ptr3] = val1;
                ptr1++;

            } else {
                // arr2 value is lessthan equals compare to arr1

                ans[ptr3] = val2;
                ptr2++;

            }
            ptr3++;
        }
        return ans;

    }

}