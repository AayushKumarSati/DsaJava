class Solution {
    public int lengthOfLastWord(String s) {
        /* approach 1: by using the stringBuilder */
        /*
         * String[] arr = s.split(" ");
         * StringBuilder ans = new StringBuilder();
         * for (int i = arr.length - 1; i >= 0; i--) {
         * if (arr[i].length() == 0) {
         * continue;
         * }
         * if (ans.length() == 0) {
         * ans.append(arr[i]);
         * 
         * }
         * }
         * return ans.length();
         */

        /** Appraoch 2: */
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count++;

            } else if (count != 0) {
                break;
            }

        }
        return count;
    }
}