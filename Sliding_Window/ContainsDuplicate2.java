package Dsa_Questions.Sliding_Window;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < i + k; j++) {
                if(i+k< nums.length && nums[j]==nums[k])
                    return true;
            }
        }
        return false;
    }
}
