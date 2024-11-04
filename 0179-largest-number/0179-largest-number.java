class Solution {
    public String largestNumber(int[] nums) {
        //create a string array and to convert the current arrays in the String arrays 
        String []arr=new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]+"";//type cast from int to String 
        }
        //sort the current String arrays and compare to what to do maximum
        Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));

        StringBuilder sb=new StringBuilder("");

        //the larget number is generated the arr array
        for(int i=arr.length-1; i>=0; i--){
           sb.append(arr[i]);
        }
        //this is the edges case the string if 0 than 
        if(sb.charAt(0)=='0')
        {
            return "0";
        }
        else{

        return sb.toString();
        }
    }
}