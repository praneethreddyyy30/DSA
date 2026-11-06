class Solution {
    public void duplicateZeros(int[] nums) {
        int res[] = new int[nums.length];
        int k=0;
        for(int i=0;(k<nums.length&&i<nums.length);i++){
            if(nums[i]!=0){
                res[k++]=nums[i];
            }else{
                res[k++]=0;
                if(k<nums.length)
                res[k++]=0;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}