class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = arr.length - 1;
        int carry = 0;
        while (i >= 0 || k > 0) {
            int numval = 0;
            if (i >= 0) {
                numval = arr[i];

            }
            int d=k%10;//it is last digit from the k.

            int sum=numval+d+carry;
            int digit=sum%10;//removing the last digits from the sum
            carry=sum/10;//find the new carry
            ans.add(digit);
            i--;
            k=k/10;//removing the last digit from the k
        }
        if(carry>0){
            ans.add(carry);//adding carry to the array list

        }
        //finally reverse the our ans arraylist
        Collections.reverse(ans);
        return ans;
    }
}