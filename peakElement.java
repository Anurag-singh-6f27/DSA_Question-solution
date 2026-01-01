package Dsa_Questions;

public class peakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2){
            return nums[0] > nums[1] ? 0 : 1;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int start=0,end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;

                if (mid< nums.length-1 && mid >0 && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                }
                if (mid< nums.length-1 && nums[mid] < nums[mid + 1]) {
                    start = mid+1;
                }
                else {
                    end = mid;
                }

        }
        return 0;
    }
}
