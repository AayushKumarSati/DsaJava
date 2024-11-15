class Solution {
    public String removeDuplicateLetters(String s) {
        // find the last index of elements and lastindex array
        int[] lastindex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) (ch - 'a');// find index of character
            lastindex[index] = i;
        }
        // create boolean array the character present or not
        boolean[] present = new boolean[26];
        // create stack
        Stack<Character> st = new Stack<>();
        // itterate the string one by one and check
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) (ch - 'a');
            if (present[index] == false) {
                while (st.size() > 0 && st.peek() > ch && lastindex[(int) (st.peek() - 'a')] > i) {
                    present[(int) (st.peek() - 'a')] = false;
                    st.pop();

                }
                st.push(ch);
                present[index] = true;
            }

        }

        StringBuilder sb = new StringBuilder("");
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        // reverse the ans
        return sb.reverse().toString();
    }
}