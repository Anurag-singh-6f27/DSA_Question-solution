package Dsa_Questions;

public class AddDigits {
    public static int addDigits(int num) {
        return digitsSum(num);
    }

    public static int digitsSum(int num){
        if(num <10)return num;
        int sum=0,k=0;
        while (num >0){
            k= num %10;
            sum+=k;
            num /=10;
        }
        return digitsSum(sum);

    }

    public static void main(String[] args) {
        System.out.println(digitsSum(38));
    }
}
