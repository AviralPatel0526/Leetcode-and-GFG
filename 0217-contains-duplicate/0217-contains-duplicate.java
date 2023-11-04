class Solution {
    public boolean containsDuplicate(int[] nums) {
      boolean c=false;
      HashSet set =new HashSet<>();

      for(int i=0; i<nums.length; i++){
        if(set.contains(nums[i]))
        c=true;
        else
        set.add(nums[i]);
      }
      return c;  
    }
}