class Solution {
    public int[] findOriginalArray(int[] changed) {
 // If the array length is odd, it's impossible to form a doubled array
        if (changed.length % 2 != 0) {
            return new int[]{};
        }

        // Step 1: Sort the array
        Arrays.sort(changed);

        // Step 2: Create a HashMap to store frequencies of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Create an array to store the original array
        int[] original = new int[changed.length / 2];
        int index = 0;

        // Step 4: Iterate through the sorted array
        for (int num : changed) {
            // If the current number's frequency is 0, skip it
            if (freqMap.getOrDefault(num, 0) == 0) {
                continue;
            }

            int twice = 2 * num;

            // Check if the double exists in the map with a positive frequency
            if (freqMap.getOrDefault(twice, 0) == 0) {
                // If not, return an empty array (invalid case)
                return new int[]{};
            }

            // Add the current number to the original array
            original[index++] = num;

            // Decrement the frequency of the current number and its double
            freqMap.put(num, freqMap.get(num) - 1);

            // Check to ensure we don't decrement below 0
            if (freqMap.get(num) < 0) {
                return new int[]{};
            }

            freqMap.put(twice, freqMap.get(twice) - 1);

            // Similarly, ensure double's frequency doesn't go below 0
            if (freqMap.get(twice) < 0) {
                return new int[]{};
            }
        }

        // Step 5: Return the original array
        return original;
    }

}