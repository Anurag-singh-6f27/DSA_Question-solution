package Dsa_Questions;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class NumReducer {
    public int numberOfSteps(int num) {
        int count =0;
        count=numberOfSteps(num,count);
        return count;
    }

    private int numberOfSteps(int num, int count) {
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
            count=numberOfSteps(num/2,count);
        }
        else {
            count++;
            count = numberOfSteps(num - 1, count);
        }
        return count;
    }

    public static void main(String[] args) {
        NumReducer num=new NumReducer();
        System.out.println(num.numberOfSteps(123));
    }
}
