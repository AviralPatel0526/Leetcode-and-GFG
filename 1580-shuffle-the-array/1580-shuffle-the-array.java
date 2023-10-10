class Solution {
    public int[] shuffle(int[] nums, int n) {
      int ans[]=new int[2*n];
      int k=0;
      int u=n;
      for(int i=0;i<2*n;i++){
          if(i%2 == 0){
              ans[i]=nums[k];
              k++;
          }
          else{
              ans[i]=nums[u];
              u++;
          }
      }
      return ans;  
    }
}