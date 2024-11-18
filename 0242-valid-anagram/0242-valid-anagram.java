class Solution {
    public boolean isAnagram(String s, String t) {
        // we use the solve this problem is HashMap
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if the character is already present HashMap than increase frequency
            if (hm.containsKey(ch) == true) {
                hm.put(ch, hm.get(ch) + 1);
            }
            // character is not present than put character and it's frequency
            else {
                hm.put(ch, 1);

            }
        }

        // check one by one the string anagram or not
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // character is present HashMap
            if (hm.containsKey(ch) == true) {
                // the character frequecy is 1 than remove character
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                }
                // decrease frequency
                else {
                    hm.put(ch, hm.get(ch) - 1);
                }

            }
            // character is not present HashMap

            else {
                return false;
            }

        }
        // the HashMap size is 0 than return true
        if (hm.size() == 0) {

            return true;
        } else {
            return false;
        }

    }
}