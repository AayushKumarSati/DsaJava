class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0) {
                continue;
            }
            if (ans.length() == 0) {
                ans.append(arr[i]);

            }
        }
        return ans.length();
    }
}