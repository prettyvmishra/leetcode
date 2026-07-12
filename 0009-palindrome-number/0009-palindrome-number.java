class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int rev = 0 ,org = x , n;
        while(x!=0){
            n = x%10;
            x=x/10;
            rev= rev*10 + n;

        }
        
       
        return rev==org;
        
    }
}