package Dsa_Questions;

public class Power {
    public static double myPow(double x, int n) {
        if(n==0 || x==1)return (double)1;
        double ans=1;
        if(n>0){
            for (int i = 1; i <=n; i++) {
                ans=ans*x;
            }
        }
        if(n<0){
            for (int i = 0; i > n; i--) {
                ans=ans*(1/x);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(5.0,3));
    }
}
