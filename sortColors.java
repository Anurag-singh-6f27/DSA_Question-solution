package Dsa_Questions;
////[...](https://leetcode.com/problems/sort-colors/submissions/1729052042/?envType=problem-list-v2&envId=array)
public class sortColors {
    public void SortColors(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int zero=0,one=0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            }
            if (num == 1) {
                one++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            nums[i]=1;
        }
        for(int i=zero+one;i<nums.length;i++){
            nums[i]=2;
        }
    }

}
