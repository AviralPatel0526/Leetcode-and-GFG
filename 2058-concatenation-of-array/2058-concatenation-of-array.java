class Solution {
    public int[] getConcatenation(int[] nums) {
       int k=nums.length;
       int ans[]= new int[2*k];
       for(int i=0;i<(2*k);i++) {
           if(i<k){
               ans[i]=nums[i];
           }
           else{
               ans[i]=nums[i-k];
           }
       }
       return ans;
    }
}