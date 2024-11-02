class Solution {
    public int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (max<arr[i]) {
                secondmax=max;
                max = arr[i];
            }
            else if(secondmax<arr[i]){
                secondmax=arr[i];
            }
        }
        int product=(max-1)*(secondmax-1);
        return product;
    }
}