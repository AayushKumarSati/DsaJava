class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0, end = n - 1;
        int maxcapicity = 0;
        while (start < end) {
            int minheight = Math.min(height[start], height[end]);

            int width = end - start;
            int currentcapicity = minheight * width;
            if (maxcapicity < currentcapicity) {
                maxcapicity = currentcapicity;

            }
            if (height[start] < height[end]) {
                start++;

            } else {
                end--;

            }

        }
        return maxcapicity;
    }
}