class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Approach-1 (Using Sorting)
        // T.C : O(n*klog(k)) (n = size of input, k = maximum length of a string in the
        // input vector)
        // S.C : O(n*k)
        Map<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            char[]arr=str.toCharArray();
            Arrays.sort(arr);
            String sortedstr=new String(arr);
            if(!map.containsKey(sortedstr)){
                map.put(sortedstr,new ArrayList<>());

            }
            map.get(sortedstr).add(str);

        }
        return new ArrayList<>(map.values());
        

    }
}