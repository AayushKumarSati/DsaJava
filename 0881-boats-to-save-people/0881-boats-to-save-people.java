class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Approach:we are use the two pointer approach firts sort the array and than
        // use two pointer and count the number of boats is required
        // Time Complexity:O(nlogn) and space Complexity:O(1)
        Arrays.sort(people);
        int n = people.length;
        int start = 0, end = n - 1, count = 0;// count variable is count the number of boats required
        while (start <= end) {
            // case 1:people[start]+people[end]>limit than
            if (people[start] + people[end] > limit) {
                count++;
                end--;
            }
            // case 2:
            else if (people[start] + people[end] <= limit) {
                count++;
                end--;
                start++;
            }
        }
        return count;
    }
}