package Dsa_Questions;
//https://leetcode.com/problems/count-elements-with-maximum-frequency
public class Max_frequency {
    public int maxFrequencyElements(int[] nums) {
        int [] frequency=new int[101];
        for (int num : nums) {
            frequency[num]++;
        }
        int max=frequency[0];
        for (int j : frequency) {
            max = Math.max(max, j);
        }
        int count=0;
        for (int j : frequency) {
            if (j == max)
                count++;

        }
        return count*max;

    }
    public static void main(String[] args) {


    }
}
