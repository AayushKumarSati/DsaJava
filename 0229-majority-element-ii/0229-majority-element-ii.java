class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int first = -1;
        int second = -1;
        int f1 = 0;
        int f2 = 0;

        // Step 1: Identify potential majority elements
        for (int ele : nums) {
            if (ele == first) {
                f1++;
            } else if (ele == second) {
                f2++;
            } else if (f1 == 0) {
                first = ele;
                f1++;
            } else if (f2 == 0) {
                second = ele;
                f2++;
            } else {
                f1--;
                f2--;
            }
        }
        // Step 2: Count occurrences of the potential majority elements
        f1 = 0;
        f2 = 0;

        for (int ele : nums) {
            if (ele == first) {
                f1++;
            } else if (ele == second) {
                f2++;
            }
        }

        // Step 3: Verify if they are actually majority elements
        int n = nums.length;
        if (f1 > n / 3) {
            ans.add(first);
        }
        if (f2 > n / 3) {
            ans.add(second);

        }

        // Step 4: Sort the result in ascending order (if needed)
        // Collections.sort(ans);
        if (ans.size() == 2) {

            if (ans.get(0) > ans.get(1)) {
                int temp = ans.get(0);
                ans.set(0, ans.get(1));
                ans.set(1, temp);

            }
        }
        return ans;
    }
}