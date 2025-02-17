/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    // col->[level->[List]]
    TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        // edge cases
        if (root == null) {
            return ans;

        }

        // by applying the DFS-BFS
        DFS(root, 0, 0);// DFS call to fill the map
        // tak care of sorting ans fill the ans
        // first loop is use to sort the colunm wise
        for (Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> entry : map.entrySet()) {
            TreeMap<Integer, ArrayList<Integer>> levelMap = entry.getValue();
            ArrayList<Integer> newList = new ArrayList<>();
            // this is the level wise sorting
            for (Map.Entry<Integer, ArrayList<Integer>> subEntry : levelMap.entrySet()) {
                ArrayList<Integer> subList = subEntry.getValue();
                // sort the level list
                Collections.sort(subList);
                // add the sublist value in the new List
                newList.addAll(subList);

            }
            ans.add(newList);

        }
        return ans;

    }

    public  void DFS(TreeNode root, int col, int level) {
        // base case
        if (root == null) {
            return;

        }
        // insert in map
        // column
        if (!map.containsKey(col)) {
            map.put(col, new TreeMap<>());
        }
        // level
        if (!map.get(col).containsKey(level)) {
            map.get(col).put(level, new ArrayList<>());
        }
        map.get(col).get(level).add(root.val);
        DFS(root.left, col - 1, level + 1);
        DFS(root.right, col + 1, level + 1);
    }
}