class Solution {
    public boolean isPalindrome(String str) {
        // handle the edges case if s==0 return true
        if (str.length() == 1) {
            return true;
        }
        // convert the upper case to lower case
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // character already in lower case
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                // convert upper case to lower case
                ch = (char) (ch - 'A' + 'a');
                sb.append(ch);

            } else if (ch >= '0' && ch <= '9') {

                sb.append(ch);

            }
        }

        // check the new lowercase string palindrome or not
        int start = 0, end = sb.length() - 1;
        while (start < end) {
            char startingchar = sb.charAt(start);
            char endchar = sb.charAt(end);
            if (startingchar != endchar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}