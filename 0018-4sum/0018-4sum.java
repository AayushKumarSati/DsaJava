class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        if(arr==null || arr.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        int n=arr.length;
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int start=j+1,end=n-1;
                while(start<end){
                    long sum=(long)arr[i]+(long)arr[j]+(long)arr[start]+(long)arr[end];
                    if(sum==target){
                        ans.add(Arrays.asList(arr[i],arr[j],arr[start],arr[end]));
                        start++;
                        end--;

                    }
                    else if(sum<target){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }



        return new ArrayList<>(ans);
    }
}