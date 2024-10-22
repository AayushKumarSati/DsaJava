class Solution {
    public int fib(int n) {
        /* base case and using recursions */
        // if(n<=1){
        // return n;
        // }
        // if(n==0){
        // return 0;

        // }
        // if(n==1){
        // return 1;
        // }
        // return fib(n-1)+fib(n-2);

        /* using itterative methods */
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {

            int third = first + second;
            first = second;
            second = third;
        }

        return first;

    }
}