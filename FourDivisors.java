package Dsa_Questions;

import java.util.ArrayList;
import java.util.List;

public class FourDIvisors {
    public int sumFourDivisors(int[] nums) {
        int sumFour=0;
        for (int i = 0; i < nums.length; i++) {
            sumFour+=findDivisorSum(nums[i]);
        }
        return sumFour;
    }
    public int findDivisorSum(int num){
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <=num; i++) {
            if(num%i==0){
                list.add(i);
                if(i!=num/i){
                    list.add(num/i);
                }
            }
        }
        int sum=0;
        if(list.size()==4){
            for (int i = 0; i < list.size(); i++) {
                sum+=list.get(i);
            }
        }
        return sum;
    }
}
