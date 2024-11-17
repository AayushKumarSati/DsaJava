class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb1=new StringBuilder(str);
        sb1.reverse();
        String result=sb1.toString();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=result.charAt(i)){
                return false;
            }
        }
        return true;
    }
}