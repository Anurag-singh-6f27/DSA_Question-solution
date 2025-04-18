package Dsa_Questions;
import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=Integer.MIN_VALUE,candidate2=Integer.MIN_VALUE;
        int count1=0,count2=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1=1;
            }
            else if(count2==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int num1:nums){
            if(num1==candidate1)count1++;
            else if(num1==candidate2)count2++;
        }
        if(count1>nums.length/3)list.add(candidate1);
        if(count2>nums.length/3)list.add(candidate2);
        return list;
    }
}
