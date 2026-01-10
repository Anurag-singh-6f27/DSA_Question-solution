package Dsa_Questions;

public class peakElement {
    public static int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        int start=0,end=nums.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid+1;
            }
            else {
                end = mid;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
