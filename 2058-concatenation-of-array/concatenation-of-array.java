class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int res[] = new int[2*nums.length];
        // for(int i=0;i<2*nums.length;i++){
        //     if(i<nums.length)res[i]=nums[i];
        //     else res[i]=nums[i-nums.length];
        // }
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        int k=0;
        for(int i=nums.length;i<2*nums.length;i++){
            res[i]=nums[k++];
        }

        return res;
    }
}