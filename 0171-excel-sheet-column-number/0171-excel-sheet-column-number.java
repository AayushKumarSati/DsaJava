class Solution {
    public int titleToNumber(String columnTitle) {
        //create two variable first is store the ans and scond is store the power
        int ans = 0, power = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            int val = (int) ch - 65 + 1;// find the current elements position
            ans += val * Math.pow(26, power);
            power++;
        }
        return ans;

    }
}