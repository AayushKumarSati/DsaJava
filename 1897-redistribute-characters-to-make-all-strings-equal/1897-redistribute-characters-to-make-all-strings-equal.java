class Solution {
    public boolean makeEqual(String[] words) {
        // create a array to find the frequency in every character
        int[] fre = new int[26];
        for (int i = 0; i < words.length; i++) {
            // find the words of string
            String w = words[i];
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                int index = (int) (ch - 'a');// find the index of any letter
                fre[index] = fre[index] + 1;// increases the frequecy

            }
        }
        // check the ans we divided equal parts or not 
        int n = words.length;
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] % n != 0) {
                return false;
            }
        }
        return true;
    }
}