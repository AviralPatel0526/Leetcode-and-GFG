class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans=0;
        for(int i=0;i<endTime.length;i++){
            if(queryTime >= startTime[i] && queryTime <= endTime[i])
            ans++;
        }
        return ans;
    }
}