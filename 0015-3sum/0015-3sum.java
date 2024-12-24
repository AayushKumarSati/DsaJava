class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        //Step1:sort the arrays
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            // edges cases:to avoid the duplicate eliments in i
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int start = i + 1, end = n - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum < 0) {
                    start++;

                } else if (sum > 0) {
                    end--;

                } else {

                    // sum==0
                    ans.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;

                    // edges cases:avoid the start pointer duplicate elements
                    while (start < end && arr[start] == arr[start - 1]) {
                        start++;

                    }
                    // Avoid duplicates for the 'end' pointer
                    while (start < end && arr[end] == arr[end + 1]) {
                        end--;
                    }
                }

            }
        }
        return ans;
    }
}