class Solution {
    public int lengthOfLongestSubstring(String s) {
        //by using hashmaps,two pointer and sliding window concept
        int n = s.length();
        int wStart = 0, wEnd = 0, maxLength = Integer.MIN_VALUE;
        //create hash map 
        HashMap<Character, Integer> hm = new HashMap<>();
        while (wEnd < n) {
            //find character 
            char ch = s.charAt(wEnd);
            if (hm.containsKey(ch) && hm.get(ch) >= wStart) {
                wStart = hm.get(ch) + 1;
            }
            //put in the hashmap 
            hm.put(ch, wEnd);
            maxLength = Math.max(maxLength, wEnd - wStart + 1);
            wEnd++;

        }
        //return 
        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;

    }
}