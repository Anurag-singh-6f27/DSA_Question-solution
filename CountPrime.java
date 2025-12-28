package Dsa_Questions;
//https://leetcode.com/problems/count-primes/?envType=problem-list-v2&envId=array
import java.util.Arrays;

public class CountPrime {
    public int countPrimes(int n) {
        boolean [] prime= new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i*i< n; i++) {

            if (prime[i]){
                for (int j = i*i; j < n; j+=i) {
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for (int i = 2; i< n; i++) {
            if(prime[i]){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        CountPrime prime =new CountPrime();
        System.out.println(prime.countPrimes(10));
    }
}
