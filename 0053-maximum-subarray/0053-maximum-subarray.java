class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int mx=Integer.MIN_VALUE;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
            }
            else{
                c++;
            }
            mx = Math.max(mx,cs);
            max=Math.max(max,nums[i]);
        }
        if(c>0){
            return mx;
        }
        else{
            return max;
        }
    }
}