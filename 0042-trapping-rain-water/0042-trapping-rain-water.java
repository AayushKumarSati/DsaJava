class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int rightmax = 0, leftmax = 0, maxheight = height[0], index = 0;
        int water = 0;
        // to find the maximum of height in building
        for (int i = 0; i < n; i++) {
            if (height[i] > maxheight) {
                maxheight = height[i];
                index = i;
            }
        }
        // to solve the left side
        for (int i = 0; i < index; i++) {
            if (leftmax > height[i]) {
                water += leftmax - height[i];

            } else {
                leftmax = height[i];
            }
        }
        //to solve the right side
        for (int i = n-1; i >index; i--) {
            if (rightmax > height[i]) {
                water += rightmax - height[i];

            } else {
                rightmax = height[i];
            }
        }
        //to return the total ammount of water
        return water;
    }
}