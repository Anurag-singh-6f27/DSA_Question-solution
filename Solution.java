package Dsa_Questions;
//https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = -1;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int [][]dimension={
                {2,6},
                {5,1},
                {3,10},
                {8,4}
        };
        Solution solution=new Solution();
        System.out.println(solution.areaOfMaxDiagonal(dimension));
    }//[[2,6],[5,1],[3,10],[8,4]]
}
