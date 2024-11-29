class Solution {
    public String addBinary(String s1, String s2) {
        int i=s1.length()-1;
        int j=s2.length()-1;
        //traverse now
        int carry=0;
        StringBuilder ans=new StringBuilder("");
        while(i>=0 || j>=0){
            //find int element
            int a=i>=0?s1.charAt(i)-'0':0;
            int b=j>=0?s2.charAt(j)-'0':0;
            int sum=a+b+carry;
            //case1
            if(sum==0){
                carry=0;
                ans.append('0');
            }
            else if(sum==1){
                carry=0;
                ans.append('1');
            }
            else if(sum==2){
                carry=1;
                ans.append('0');
            }
            else{
                carry=1;
                ans.append('1');
            }
            i--;
            j--;
        }
        if(carry==1){
            ans.append('1');
        }
        return ans.reverse().toString();
    }
}