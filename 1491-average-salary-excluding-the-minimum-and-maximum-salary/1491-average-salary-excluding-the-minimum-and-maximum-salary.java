class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for (int i = 1; i < salary.length; i++) {
            // find the max value
            if (max < salary[i]) {
                max = salary[i];
            }
            // find the minimum value
            if (min > salary[i]) {
                min = salary[i];
            }
            // sum the all arrays elements
            sum += salary[i];
        }
        // update the sum value
        sum = sum - min - max;
        // return the answer and convert the int to double
        double ans = (double) sum / (salary.length - 2);
        return ans;

    }
}