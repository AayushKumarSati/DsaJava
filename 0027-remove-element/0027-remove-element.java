class Solution {
    public int removeElement(int[] arr, int val) {
        int ptr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[ptr] = arr[i];
                ptr++;

            }
        }
        return ptr;
    }
}