class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        // this problem is solving by using the hashMap
        // Time Complexity:O(n*mlogm)
        // Space Complexity:O(n*m)
        // because n=length of arrays and m=average length of string
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        // traverse the array and firstly sort array
        // and than add Values in the HashMap
        for (String ele : arr) {
            char[] temp = ele.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            // if the String not present in the HashMap
            hm.putIfAbsent(str, new ArrayList<>());
            hm.get(str).add(ele);
        }
        // finally add all values in the ans
        for (List<String> ele : hm.values()) {
            ans.add(ele);
        }
        return ans;

    }
}