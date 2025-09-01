package Dsa_Questions;
//https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=array
public class PlusOne {
    public void plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                display(digits);
                return;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        display(result);
    }
    void display(int [] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
        PlusOne one=new PlusOne();
        int []a={1,2,3};
        one.plusOne(a);
    }
}
