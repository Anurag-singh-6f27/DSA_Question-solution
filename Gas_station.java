package Dsa_Questions;

import java.util.Arrays;

public class Gas_station {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumgas= Arrays.stream(gas).sum();
        int sumcost=Arrays.stream(cost).sum();
        if(sumgas<sumcost){
            return -1;
        }
        int start=0,currfuel=0,fueldiff;
        for (int i = start; i < gas.length; i++) {
            fueldiff=gas[i]-cost[i];
            currfuel+=fueldiff;
            if(currfuel<0){
                start=i+1;
                currfuel=0;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] gas={2,3,4},cost={3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
