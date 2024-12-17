class Solution {
    public int myAtoi(String str) {
        int n = str.length();
        int i = 0;
        // step1:remove the white space
        while (i < n && str.charAt(i) == ' ') {
            ++i;
        }
        // step2:sign positive and negative
        int sign = 1;
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            if (str.charAt(i) == '-') {
                sign = -1;
            }
            ++i;
        }
        // step3:
        long ans = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            // covert string to int
            ans = ans * 10 + str.charAt(i) - '0';
            // step4:
            if (ans * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (ans * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            ++i;
        }
        return (int) (ans * sign);// type casting to int
    }
}