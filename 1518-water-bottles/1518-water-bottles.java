class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newb = numBottles / numExchange;// new bottels find out to add
            int remb = numBottles % numExchange;/** remaining bottels */
            ans += newb;
            numBottles=newb + remb;
        }
        return ans;
    }
}