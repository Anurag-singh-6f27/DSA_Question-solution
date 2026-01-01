package Dsa_Questions;
//https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan-v2&envId=top-interview-150
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1;
        int start=0,end=matrix.length-1;
        int columns=matrix[0].length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][columns]){
                row=mid;
                break;
            }
            if(target<matrix[mid][0]){
                end=mid-1;
            }
            if(target>matrix[mid][0]){
                start=mid+1;
            }
        }
        if(row==-1)return false;
        start=0;
        end=columns;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(matrix[row][mid]>target){
                end=mid-1;
            }
            if(matrix[row][mid]<target){
                start=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
