class Solution {
    public boolean isPalindrome(int x) {
        /*to handle the negative case */
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;

        }
        if(rev!=x){
            return false;
        }
        else{
            return true;
        }
        
    }
}