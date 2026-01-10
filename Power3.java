package Dsa_Questions;

public class Power3 {
    public static boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        while(n>1){
            if(n%3!=0)return false;

            n/=3;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
