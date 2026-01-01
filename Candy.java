package Dsa_Questions;

import java.util.Arrays;

//https://leetcode.com/problems/candy/?envType=problem-list-v2&envId=array
public class Candy {
    public int candy(int[] ratings) {
       int [] candies= new int[ratings.length];
       Arrays.fill(candies,1);
        for (int i = 1; i < ratings.length; i++) {

            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for (int i = ratings.length-2; i >=0; i--) {

            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int sum=0;
        for (int candy : candies) {
            sum += candy;
        }
        return sum;
    }

    public static void main(String[] args) {
        Candy obj=new Candy();
        int [] rating={1,2,3,4,3,4};
        System.out.println(obj.candy(rating));
    }
}
