package Dsa_Questions;

public class Diagonal_prime {
    public int diagonalPrime(int[][] nums) {
        int LargestPrime=0;
        for (int i = 0; i < nums.length; i++) {
            if(checkPrime(nums[i][i])){
                LargestPrime=Math.max(LargestPrime,nums[i][i]);
            }
            if(checkPrime(nums[i][nums.length - i - 1])){
                LargestPrime=Math.max(LargestPrime,nums[i][nums.length - i - 1]);
            }
        }
        return LargestPrime;
    }

    private boolean checkPrime(int i) {
        if (i <= 1) return false;

        for (int j = 2; j*j <=i; j++) {
            if(i%j==0){
                return false;
            }

        }
        return true;
    }

}
