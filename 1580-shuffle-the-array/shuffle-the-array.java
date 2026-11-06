class Solution {
    public int[] shuffle(int[] nums, int n) {
        
    //     int a[] = new int[n];
    //     int k=0;

    //     for(int i=n;i<2*n;i++){
    //         a[k]=nums[i];
    //         k++;
    //     }

    //     for(int i=n-1;i>0;i--){
    //         nums[i+i]=nums[i];
    //     }
    //     k=0;
    //     for(int i=1;i<2*n;i+=2){
    //         nums[i]=a[k];
    //         k++;
    //     }

    //    return nums;

    int a[] =new int[nums.length];
    int k=0;
    for(int i=0;i<n;i++){
       a[k]=nums[i];
       k=k+2;
    }
    k=1;
    for(int i=n;i<nums.length;i++){
       a[k]=nums[i];
       k+=2;
    }

    return a;
    }
}