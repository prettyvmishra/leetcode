class Solution {
    public int findGCD(int[] nums) {
        int g = nums[0], s =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>g)
            g=nums[i];
            if(nums[i]<s)
            s=nums[i];
        
        }
        while(s!=0){
            int temp = s;
            s = g%s;
            g = temp;
        }
        return g;
    }
}