class Solution {
    public int compress(char[] chars) {
        int count = 1;// count is stroe the frequecy of elements
        StringBuilder sb = new StringBuilder("");
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            // check the current elements same or not previous elements
            if (chars[i - 1] != chars[i]) {
                // check the count is > 1 than add count
                if (count > 1) {
                    sb.append(count + "");
                }
                sb.append(chars[i]);
                count = 1;// because new count start
            } else {
                count++;
            }
        }
        // if some count is remaining
        if (count > 1) {
            sb.append(count + "");
        }
        //finally add the new elements into origunal array 
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);
            chars[i]=ch;

        }
        return sb.length();
    }

}