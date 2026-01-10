package Dsa_Questions;

public class MaxConsecOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=-1,count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=1){
                maxcount=Math.max(maxcount,count);
                count=0;
                continue;
            }
            count++;
        }
        return maxcount;
    }
}
