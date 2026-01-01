package Dsa_Questions;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add((nums[i]))){
                return true;
            }
        }
        return false;
    }
}
