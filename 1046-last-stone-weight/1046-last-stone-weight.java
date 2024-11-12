class Solution {
    public int lastStoneWeight(int[] stones) {
        /* this problem we are solve the by using the priorityQueue */
        // max priorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // all the elements in add pq
        for (int ele : stones) {
            pq.add(ele);
        }
        while (pq.size() > 1) {
            int maxstone = pq.remove();// top most elements
            int secondmaxstone = pq.remove();
            int newstone = maxstone - secondmaxstone;
            if (newstone != 0) {
                pq.add(newstone);
            }
        }
        // if pq.size is 0 menas pq is empty than return 0 else return pq.remove
        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.remove();
        }
    }
}