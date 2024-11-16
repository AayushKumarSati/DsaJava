class Solution {
    public int maxPower(String s) {
        int count = 1, max = 1;
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char current = s.charAt(i);
            if (prev == current) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        // if loop is close than the last count and max value is not update than we
        // check
        max = Math.max(max, count);
        return max;
    }
}