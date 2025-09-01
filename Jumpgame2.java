package Dsa_Questions;
//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class Jumpgame2 {
    public int jump(int[] nums) {
        int len=nums.length;
        if(len==1){
            return 0;
        }
        if(nums[0]>=len){
            return 1;
        }
        int farthest=0, jumpcount =0,end=0;
        for(int i=0;i<len-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==end){
                jumpcount++;
                end=farthest;
            }
            if (end >= len - 1) {
                break;
            }
        }
        return jumpcount;
    }

    public static void main(String[] args) {
        int []arr={2,3,1,1,4,2,3,1,5,6,9,8,7,4,5,2,9};
        Jumpgame2 jumpgame2=new Jumpgame2();
        System.out.println(jumpgame2.jump(arr));
    }
}
