package Dsa_Questions;
//https://leetcode.com/problems/find-the-duplicate-number/description/
class FindDuplicatenum extends Cyclic_Sort{
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if((i+1)!=nums[i]){
                return nums[i];
            }
        }
        return 0;
    }
}