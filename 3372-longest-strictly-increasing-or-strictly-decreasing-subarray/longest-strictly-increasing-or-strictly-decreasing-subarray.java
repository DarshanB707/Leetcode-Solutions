class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int asc = 1, dcs = 1, t1 = 1, t2 = 1;
        for(int i = 1; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                t1++;
                asc = Math.max(asc, t1);
            }else{
                t1 = 1;
            }
            if(nums[i-1]>nums[i]){
                t2++;
                dcs = Math.max(dcs, t2);
            }else{
                t2 = 1;
            }
        }
        return Math.max(asc, dcs);
    }
}