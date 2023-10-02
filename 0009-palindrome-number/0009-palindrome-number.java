class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int s=0;
        while(copy > 0){
            int r=copy%10;
            s=s*10+r;
            copy=copy/10;
        }
        if(s==x)
            return true;
        else
            return false;
    }
}