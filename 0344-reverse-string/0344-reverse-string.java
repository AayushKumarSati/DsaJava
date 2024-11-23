class Solution {
    public void reverseString(char[] s) {

        // Approach 1:
        // Stack<Character> st = new Stack<>();
        // for (int i = 0; i < s.length; i++) {
        // st.push(s[i]);
        // }
        // int i = 0;
        // while (!st.isEmpty()) {
        // s[i] = st.peek();
        // st.pop();
        // i++;
        // }

        // Approach:2
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}