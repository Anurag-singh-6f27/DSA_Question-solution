package Dsa_Questions;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        boolean left=false,right=false;
        while (i<arr.length-1){
            if(arr[i]>arr[i+1]){
                break;
            }
            if(arr[i]==arr[i+1])return false;
            i++;
        }
        while (i<arr.length-1){
            if(arr[i]<=arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
